#ifndef DELETE_H
#define DELETE_H

#include <QWidget>
#include "dictionary.h"
namespace Ui {
class Delete;
}

class Delete : public QWidget
{
    Q_OBJECT

public:
    explicit Delete(QWidget *parent = nullptr);
    ~Delete();
signals:
    void firstWindow();

private slots:
    void receiveData(Dictionary &dictionary);

    void on_pushButton_2_clicked();

private:
    Ui::Delete *ui;
};

#endif // DELETE_H
