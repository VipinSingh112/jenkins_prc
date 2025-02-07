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
 * The table class for the &quot;nbp_acquire_land_prop_details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandPropertyDetails
 * @generated
 */
public class AcquireLandPropertyDetailsTable
	extends BaseTable<AcquireLandPropertyDetailsTable> {

	public static final AcquireLandPropertyDetailsTable INSTANCE =
		new AcquireLandPropertyDetailsTable();

	public final Column<AcquireLandPropertyDetailsTable, Long>
		acquireLandPropertyDetailsId = createColumn(
			"acquireLandPropertyDetailsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AcquireLandPropertyDetailsTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropIdentified = createColumn(
			"landPropIdentified", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String> landPropAddr =
		createColumn(
			"landPropAddr", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropOccupation = createColumn(
			"landPropOccupation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropOccupationPeriod = createColumn(
			"landPropOccupationPeriod", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropTenureType = createColumn(
			"landPropTenureType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropDesiredLoc = createColumn(
			"landPropDesiredLoc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropProposedUse = createColumn(
			"landPropProposedUse", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropProposedUseOther = createColumn(
			"landPropProposedUseOther", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropPropTenureType = createColumn(
			"landPropPropTenureType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropApplied = createColumn(
			"landPropApplied", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, Date>
		landPropApplicationDate = createColumn(
			"landPropApplicationDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropExistingBuilding = createColumn(
			"landPropExistingBuilding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropExistingBuildingOther = createColumn(
			"landPropExistingBuildingOther", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String> landPropOwn =
		createColumn(
			"landPropOwn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropGovAcquired = createColumn(
			"landPropGovAcquired", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropStateDetails = createColumn(
			"landPropStateDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropPaymentMethod = createColumn(
			"landPropPaymentMethod", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropPaymentMethodOther = createColumn(
			"landPropPaymentMethodOther", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, String>
		landPropComments = createColumn(
			"landPropComments", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandPropertyDetailsTable, Long>
		acquireApplicationId = createColumn(
			"acquireApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AcquireLandPropertyDetailsTable() {
		super(
			"nbp_acquire_land_prop_details",
			AcquireLandPropertyDetailsTable::new);
	}

}