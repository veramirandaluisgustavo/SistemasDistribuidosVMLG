<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use App\Models\Cuenta;
use Illuminate\Http\Request;

class CuentaController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        
        return response()->json([
            "cuentas"=>Cuenta::all()
        ]);
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        Cuenta::create($request->all());
        return response()->json([
            "res"=>true,
            "msg"=>"Cuenta guardado correctamente"

        ]);
    }

    /**
     * Display the specified resource.
     */
    public function show(Cuenta $cuenta)
    {
        return response()->json([
            "res"=>true,
            "medico"=>$cuenta
        ],200);
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Cuenta $cuenta)
    {
        $cuenta->update($request->all());
        return response()->json([
            "res"=>true,
            "msg"=>"Cuenta actualizado correctamente"
        ],200);
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Cuenta $cuenta)
    {
        $cuenta->delete();
        return response()->json([
            "res"=>true,
            "msg"=>"Se borro correctamente"
        ]);
    }
}
