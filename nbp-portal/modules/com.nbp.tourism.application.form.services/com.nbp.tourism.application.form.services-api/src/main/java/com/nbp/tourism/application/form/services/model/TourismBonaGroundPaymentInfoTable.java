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
 * The table class for the &quot;nbp_tourism_bona_gro_pay&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundPaymentInfo
 * @generated
 */
public class TourismBonaGroundPaymentInfoTable
	extends BaseTable<TourismBonaGroundPaymentInfoTable> {

	public static final TourismBonaGroundPaymentInfoTable INSTANCE =
		new TourismBonaGroundPaymentInfoTable();

	public final Column<TourismBonaGroundPaymentInfoTable, Long>
		tourismBonaGroundPayId = createColumn(
			"tourismBonaGroundPayId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaGroundPaymentInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundPaymentInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundPaymentInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundPaymentInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundPaymentInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundPaymentInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundPaymentInfoTable, String>
		paymentMethod = createColumn(
			"paymentMethod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundPaymentInfoTable, String>
		paymentOtherMethod = createColumn(
			"paymentOtherMethod", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundPaymentInfoTable, String>
		paymentProof = createColumn(
			"paymentProof", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundPaymentInfoTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaGroundPaymentInfoTable() {
		super(
			"nbp_tourism_bona_gro_pay", TourismBonaGroundPaymentInfoTable::new);
	}

}