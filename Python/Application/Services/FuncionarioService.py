from Python.Infrastructure.Repositories.FuncionarioRepository import FuncionarioRepository

class FuncionarioService:

    def __init__(self):
        self.__repository = FuncionarioRepository()
    
    def GetFuncionarios(self) -> []:
        return self.__repository.GetAll()