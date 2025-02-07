/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_acc_ins_body_other&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOtherReq
 * @generated
 */
public class AccInsBodiesOtherReqTable
	extends BaseTable<AccInsBodiesOtherReqTable> {

	public static final AccInsBodiesOtherReqTable INSTANCE =
		new AccInsBodiesOtherReqTable();

	public final Column<AccInsBodiesOtherReqTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOtherReqTable, Long>
		accInsBodiesOtherReqId = createColumn(
			"accInsBodiesOtherReqId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccInsBodiesOtherReqTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOtherReqTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOtherReqTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOtherReqTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOtherReqTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOtherReqTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOtherReqTable, String> applicationFees =
		createColumn(
			"applicationFees", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOtherReqTable, String> insPaymentMethod =
		createColumn(
			"insPaymentMethod", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOtherReqTable, String> applicantRepName =
		createColumn(
			"applicantRepName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOtherReqTable, String>
		applicantRepPosition = createColumn(
			"applicantRepPosition", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOtherReqTable, Date> signatureDate =
		createColumn(
			"signatureDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOtherReqTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccInsBodiesOtherReqTable() {
		super("nbp_janaac_acc_ins_body_other", AccInsBodiesOtherReqTable::new);
	}

}