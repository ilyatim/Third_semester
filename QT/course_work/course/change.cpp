#include "change.h"
#include "ui_change.h"

Change::Change(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Change)
{
    ui->setupUi(this);
}

Change::~Change()
{
    delete ui;
}

void Change::enterWord(Dictionary &dictionary)
{
    QString name;
    for(int i = 0; i < dictionary.getSize(); i++)
    {
        name = QString::fromStdString(dictionary.getName(i));
        ui->comboBox->addItem(name);
    }
}

void Change::on_pushButton_2_clicked()
{
    this->close();
    ui->comboBox->clear();
    emit firstWindow();
}

void Change::on_pushButton_clicked()
{
    QString name = ui->comboBox->currentText();
    int number_of_name = ui->comboBox->currentIndex();
    emit sendWordToChange(name, number_of_name);
    this->close();
    ui->comboBox->clear();
    emit firstWindow();
}
