#ifndef VVOD_SLOV_H
#define VVOD_SLOV_H

#include <QDialog>
#include "dictionary.h"
namespace Ui {
class vvod_slov;
}

class vvod_slov : public QDialog
{
    Q_OBJECT

public:
    explicit vvod_slov(QWidget *parent = nullptr);
    ~vvod_slov();
signals:
    void firstWindow();
    void sendData(QString word, QString definition);

private slots:
    void on_pushButton_clicked();

    void on_pushButton_2_clicked();

private:
    Ui::vvod_slov *ui;
};

#endif // VVOD_SLOV_H
