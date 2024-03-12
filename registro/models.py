from django.db import models

class Estudiante(models.Model):
    name = models.CharField(max_length=50)
    curso = models.CharField(max_length=3)
    asignatura = models.CharField(max_length=100)  
    docente = models.CharField(max_length=50)  
    date = models.DateTimeField()
    asistencia = models.BooleanField(default=False)  

    class Meta:
        db_table = 'estudiante'

