#include <QMessageBox>
#include "output.h"
#include "ui_output.h"

Output::Output(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Output)
{
    ui->setupUi(this);
}

Output::~Output()
{
    delete ui;
}

void Output::print(QString name)
{
    QMessageBox::critical(this, "fuck", name);
}

