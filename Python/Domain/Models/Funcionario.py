import datetime

class Funcionario:
    def __init__(self, nome, id = 0, dataCadastro = datetime.datetime.now()):
        self.__id = id
        self.__nome = nome
        self.__dataCadastro = dataCadastro

    @property
    def nome(self):
        return self.__nome
    
    @property
    def id(self):
        return self.__id
    
    @property
    def dataCadastro(self):
        return self.__dataCadastro
    
    def __str__(self):
        return 'Funcionário - ' + self.__id.__str__() + ' - ' + self.__nome