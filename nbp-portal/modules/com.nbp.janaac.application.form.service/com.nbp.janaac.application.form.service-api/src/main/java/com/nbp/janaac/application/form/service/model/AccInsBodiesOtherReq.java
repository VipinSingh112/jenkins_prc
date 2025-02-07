/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AccInsBodiesOtherReq service. Represents a row in the &quot;nbp_janaac_acc_ins_body_other&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOtherReqModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOtherReqImpl"
)
@ProviderType
public interface AccInsBodiesOtherReq
	extends AccInsBodiesOtherReqModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOtherReqImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AccInsBodiesOtherReq, Long>
		ACC_INS_BODIES_OTHER_REQ_ID_ACCESSOR =
			new Accessor<AccInsBodiesOtherReq, Long>() {

				@Override
				public Long get(AccInsBodiesOtherReq accInsBodiesOtherReq) {
					return accInsBodiesOtherReq.getAccInsBodiesOtherReqId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AccInsBodiesOtherReq> getTypeClass() {
					return AccInsBodiesOtherReq.class;
				}

			};

}