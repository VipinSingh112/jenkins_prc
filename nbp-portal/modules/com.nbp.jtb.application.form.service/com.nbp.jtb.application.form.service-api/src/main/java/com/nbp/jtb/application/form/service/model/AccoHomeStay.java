/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AccoHomeStay service. Represents a row in the &quot;nbp_jtb_acco_home_stay_lic&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AccoHomeStayModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jtb.application.form.service.model.impl.AccoHomeStayImpl"
)
@ProviderType
public interface AccoHomeStay extends AccoHomeStayModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jtb.application.form.service.model.impl.AccoHomeStayImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AccoHomeStay, Long>
		ACCO_HOME_STAY_ID_ACCESSOR = new Accessor<AccoHomeStay, Long>() {

			@Override
			public Long get(AccoHomeStay accoHomeStay) {
				return accoHomeStay.getAccoHomeStayId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AccoHomeStay> getTypeClass() {
				return AccoHomeStay.class;
			}

		};

}