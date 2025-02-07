/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_acquire_prop_details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePropertyDetails
 * @generated
 */
public class AcquirePropertyDetailsTable
	extends BaseTable<AcquirePropertyDetailsTable> {

	public static final AcquirePropertyDetailsTable INSTANCE =
		new AcquirePropertyDetailsTable();

	public final Column<AcquirePropertyDetailsTable, Long>
		acquirePropertyDetailsId = createColumn(
			"acquirePropertyDetailsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AcquirePropertyDetailsTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyTenureType = createColumn(
			"propertyTenureType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyIdentified = createColumn(
			"propertyIdentified", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String> propertyAddr =
		createColumn(
			"propertyAddr", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyDesiredLoc = createColumn(
			"propertyDesiredLoc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String> propertyVolume =
		createColumn(
			"propertyVolume", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String> propertyFolio =
		createColumn(
			"propertyFolio", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyValuationNum = createColumn(
			"propertyValuationNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertySketchAttached = createColumn(
			"propertySketchAttached", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyCurrentUse = createColumn(
			"propertyCurrentUse", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyCurrentUseOther = createColumn(
			"propertyCurrentUseOther", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyExistingBuilding = createColumn(
			"propertyExistingBuilding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyExistingBuildingOther = createColumn(
			"propertyExistingBuildingOther", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyExistingInfrastructure = createColumn(
			"propertyExistingInfrastructure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyProposedUse = createColumn(
			"propertyProposedUse", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyProposedUseOther = createColumn(
			"propertyProposedUseOther", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyProposedInfrastructure = createColumn(
			"propertyProposedInfrastructure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyLandAreaHectare = createColumn(
			"propertyLandAreaHectare", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyLandAreaAcres = createColumn(
			"propertyLandAreaAcres", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyLandAreaRoods = createColumn(
			"propertyLandAreaRoods", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyLandAreaPerches = createColumn(
			"propertyLandAreaPerches", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyAdjoiningNorth = createColumn(
			"propertyAdjoiningNorth", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyAdjoiningSouth = createColumn(
			"propertyAdjoiningSouth", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyAdjoiningEast = createColumn(
			"propertyAdjoiningEast", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyAdjoiningWest = createColumn(
			"propertyAdjoiningWest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, Date> propertyDate =
		createColumn(
			"propertyDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, String>
		propertyAdditionalInfo = createColumn(
			"propertyAdditionalInfo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePropertyDetailsTable, Long>
		acquireApplicationId = createColumn(
			"acquireApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AcquirePropertyDetailsTable() {
		super("nbp_acquire_prop_details", AcquirePropertyDetailsTable::new);
	}

}