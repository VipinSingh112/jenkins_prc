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
 * The extended model interface for the AccCerBodyMngReqTwo service. Represents a row in the &quot;nbp_janaac_acc_cer_manage_2&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyMngReqTwoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AccCerBodyMngReqTwoImpl"
)
@ProviderType
public interface AccCerBodyMngReqTwo
	extends AccCerBodyMngReqTwoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyMngReqTwoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AccCerBodyMngReqTwo, Long>
		ACC_CER_BODY_MNG_REQ_TWO_ID_ACCESSOR =
			new Accessor<AccCerBodyMngReqTwo, Long>() {

				@Override
				public Long get(AccCerBodyMngReqTwo accCerBodyMngReqTwo) {
					return accCerBodyMngReqTwo.getAccCerBodyMngReqTwoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AccCerBodyMngReqTwo> getTypeClass() {
					return AccCerBodyMngReqTwo.class;
				}

			};

}