#include "vvod_slov.h"
#include "ui_vvod_slov.h"
#include <cstring>
#include <QMessageBox>

vvod_slov::vvod_slov(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::vvod_slov)
{
    ui->setupUi(this);
}

vvod_slov::~vvod_slov()
{
    delete ui;
}

void vvod_slov::on_pushButton_clicked()
{
    QString word = ui->word->text();
    QString definition = ui->definition->text();
    if(word.isEmpty() || definition.isEmpty())
        QMessageBox::warning(this, "WARNING", "EMPTY ONE OR TWO FIELD");
    else
    {
        emit sendData(word, definition);
        ui->word->setText("");
        ui->definition->setText("");
        this->close();
        emit firstWindow();
    }
}

void vvod_slov::on_pushButton_2_clicked()
{
    ui->word->setText("");
    ui->definition->setText("");
    this->close();
    emit firstWindow();
}
