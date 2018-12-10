#include <QMessageBox>
#include "from_file.h"
#include "ui_from_file.h"

From_file::From_file(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::From_file)
{
    ui->setupUi(this);
}

From_file::~From_file()
{
    delete ui;
}

void From_file::on_pushButton_clicked()
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

void From_file::on_pushButton_2_clicked()
{
    ui->lineEdit->setText("");
    this->close();
    emit firstWindow();
}
