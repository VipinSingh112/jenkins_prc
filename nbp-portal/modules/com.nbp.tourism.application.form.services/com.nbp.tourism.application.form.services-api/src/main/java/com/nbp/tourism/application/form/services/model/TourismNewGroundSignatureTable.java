/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_tourism_new_ground_sign&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewGroundSignature
 * @generated
 */
public class TourismNewGroundSignatureTable
	extends BaseTable<TourismNewGroundSignatureTable> {

	public static final TourismNewGroundSignatureTable INSTANCE =
		new TourismNewGroundSignatureTable();

	public final Column<TourismNewGroundSignatureTable, Long>
		TourismNewGroundSignatureId = createColumn(
			"TourismNewGroundSignatureId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewGroundSignatureTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundSignatureTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundSignatureTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundSignatureTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundSignatureTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundSignatureTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundSignatureTable, Date>
		groundTransportationDate = createColumn(
			"groundTransportationDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundSignatureTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewGroundSignatureTable() {
		super(
			"nbp_tourism_new_ground_sign", TourismNewGroundSignatureTable::new);
	}

}