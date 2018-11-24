#include <QFileDialog>
#include <QInputDialog>
#include "mainwindow.h"

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    enter = new vvod_slov();
    del = new Delete();

    connect(enter, &vvod_slov::firstWindow, this, &MainWindow::show);
    connect(del, &Delete::firstWindow, this, &MainWindow::show);

    connect(enter, SIGNAL(sendData(QString, QString)), this, SLOT(receiveData(QString, QString)));
    connect(this, SIGNAL(sendWords(Dictionary &dictionary)), del, SLOT(receiveData(Dictionary &dicitonary)));
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::receiveData(QString word, QString definition)
{
    dictionary.new_word(word.toStdString(), definition.toStdString());
}

void MainWindow::on_pushButton_clicked()
{
    enter->show();
    this->close();
}

void MainWindow::on_pushButton_2_clicked()
{
    if(dictionary.getSize() == 0)
        QMessageBox::critical(this, "ERROR", "EMPTY DICTIONARY");
    else
        QMessageBox::information(this, "All words", dictionary.output());
}

void MainWindow::on_pushButton_4_clicked()
{
    if(dictionary.getSize() == 0)
        QMessageBox::critical(this, "ERROR", "EMPTY DICTIONARY");
    else
    {
        bool ok;
        QString name = QInputDialog::getText(this, "Введите слово для поиска", "слово:", QLineEdit::Normal, "", &ok);

        if(ok)
        {
            if(name.isEmpty())
                QMessageBox::critical(this, "ERROR", "EMPTY FIELD");
            else
            {
                if(dictionary.search(name.toStdString()))
                    ui->statusBar->showMessage("This word exist");
                else
                    QMessageBox::critical(this, "Warning", "WRONG WORD");
            }
        }

    }
}

void MainWindow::on_pushButton_3_clicked()
{
    if(dictionary.getSize() == 0)
        QMessageBox::critical(this, "ERROR", "EMPTY DICTIONARY");
    else
    {
        emit sendWords(dictionary);
        del->show();
        this->close();
    }

}


void MainWindow::on_action_3_triggered()
{
    QApplication::exit();
}

void MainWindow::on_action_triggered()
{
    QString filter = "Text File (*.txt)";
    QString file_name = QFileDialog::getOpenFileName(this, "Open a file", "C://", filter);
    dictionary.from_text(file_name, dictionary);
}

void MainWindow::on_action_2_triggered()
{
    QString filter = "Text File (*.txt)";
    QString file_name = QFileDialog::getOpenFileName(this, "Open a file", "C://", filter);
    dictionary.in_text(file_name);
}

void MainWindow::on_action_4_triggered()
{
    QMessageBox::information(this, "дополнительная информация", "Приветствую вас в своей программе 'словарь с дубликатами'");
}

void MainWindow::on_action_5_triggered()
{
    dictionary.empty_dictionary();
}
