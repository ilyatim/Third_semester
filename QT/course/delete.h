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
    void enterWords(Dictionary&);
signals:
    void firstWindow();
    void sendWordToDelete(QString);
private slots:

    void on_pushButton_2_clicked();

    void on_pushButton_clicked();

private:
    Ui::Delete *ui;
};

#endif // DELETE_H
