#include <QMessageBox>
#include "in_file.h"
#include "ui_in_file.h"

In_file::In_file(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::In_file)
{
    ui->setupUi(this);
}

In_file::~In_file()
{
    delete ui;
}

void In_file::on_pushButton_clicked()
{
    QString name = ui->lineEdit->text();
    if(name.isEmpty())
        QMessageBox::critical(this, "ERROR", "EMPTY FIELD");
    else
    {
        emit sendData(name);
        ui->lineEdit->setText("");
        this->close();
        emit firstWindow();
    }
}

void In_file::on_pushButton_2_clicked()
{
    ui->lineEdit->setText("");
    this->close();
    emit firstWindow();
}
