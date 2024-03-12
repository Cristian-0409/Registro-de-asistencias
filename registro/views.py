from django.http.response import JsonResponse
from django.shortcuts import render
from .models import Estudiante

# Create your views here.
def index(request):
    return render(request,'index.html')

def registro(_request):
    estudiante=list(Estudiante.objects.values())
    data={"estudiante":estudiante}
    return JsonResponse(data)