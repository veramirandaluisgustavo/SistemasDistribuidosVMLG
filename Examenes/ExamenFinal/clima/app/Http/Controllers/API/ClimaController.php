<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Clima;

class ClimaController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        return Clima::all();
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        Clima::create($request->all());
        return response()->json([
            "msg"=>"Clima guardado correctamente"

        ]);
    }

    /**
     * Display the specified resource.
     */
    public function show(Clima $clima)
    {
        return response()->json([
            "clima"=>$clima
        ]);
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Clima $clima)
    {
        $clima->update($request->all());
        return response()->json([
            "msg"=>"clima actualizado correctamente"
        ]);
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Clima $clima)
    {
        $clima->delete();
        return response()->json([
            "msg"=>"Se borro correctamente"
        ]);
    }
}
