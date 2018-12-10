#include "delete.h"
#include <QDebug>
#include <cstring>
#include "ui_delete.h"

Delete::Delete(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Delete)
{

    ui->setupUi(this);
}

Delete::~Delete()
{
    delete ui;
}

void Delete::enterWords(Dictionary &dictionary)
{
    QString name;
    for(int i = 0; i < dictionary.getSize(); i++)
    {
        name = QString::fromStdString(dictionary.getName(i));
        ui->comboBox->addItem(name);
    }
}


void Delete::on_pushButton_2_clicked()
{
    this->close();
    ui->comboBox->clear();
    emit firstWindow();
}

void Delete::on_pushButton_clicked()
{
    QString name = ui->comboBox->currentText();
    emit sendWordToDelete(name);
    this->close();
    ui->comboBox->clear();
    emit firstWindow();
}
