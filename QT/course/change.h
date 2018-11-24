#ifndef CHANGE_H
#define CHANGE_H

#include <QWidget>
#include "dictionary.h"

namespace Ui {
class Change;
}

class Change : public QWidget
{
    Q_OBJECT

public:
    explicit Change(QWidget *parent = nullptr);
    ~Change();
    void enterWord(Dictionary&);
signals:
    void firstWindow();
    void sendWordToChange(QString, int);
private slots:
    void on_pushButton_2_clicked();

    void on_pushButton_clicked();

private:
    Ui::Change *ui;
};

#endif // CHANGE_H
