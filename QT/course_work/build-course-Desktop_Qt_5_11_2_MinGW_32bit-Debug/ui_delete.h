/********************************************************************************
** Form generated from reading UI file 'delete.ui'
**
** Created by: Qt User Interface Compiler version 5.11.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_DELETE_H
#define UI_DELETE_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QComboBox>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_Delete
{
public:
    QPushButton *pushButton;
    QPushButton *pushButton_2;
    QComboBox *comboBox;

    void setupUi(QWidget *Delete)
    {
        if (Delete->objectName().isEmpty())
            Delete->setObjectName(QStringLiteral("Delete"));
        Delete->resize(400, 300);
        pushButton = new QPushButton(Delete);
        pushButton->setObjectName(QStringLiteral("pushButton"));
        pushButton->setGeometry(QRect(70, 170, 101, 28));
        pushButton_2 = new QPushButton(Delete);
        pushButton_2->setObjectName(QStringLiteral("pushButton_2"));
        pushButton_2->setGeometry(QRect(222, 170, 111, 28));
        comboBox = new QComboBox(Delete);
        comboBox->setObjectName(QStringLiteral("comboBox"));
        comboBox->setGeometry(QRect(140, 90, 131, 21));

        retranslateUi(Delete);

        QMetaObject::connectSlotsByName(Delete);
    } // setupUi

    void retranslateUi(QWidget *Delete)
    {
        Delete->setWindowTitle(QApplication::translate("Delete", "Form", nullptr));
        pushButton->setText(QApplication::translate("Delete", "\320\237\321\200\320\276\320\264\320\276\320\273\320\266\320\270\321\202\321\214", nullptr));
        pushButton_2->setText(QApplication::translate("Delete", "\320\222\320\265\321\200\320\275\321\203\321\202\321\214\321\201\321\217 \320\275\320\260\320\267\320\260\320\264", nullptr));
    } // retranslateUi

};

namespace Ui {
    class Delete: public Ui_Delete {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_DELETE_H
