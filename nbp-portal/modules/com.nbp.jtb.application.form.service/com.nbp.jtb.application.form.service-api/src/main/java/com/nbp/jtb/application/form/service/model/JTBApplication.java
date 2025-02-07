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
 * The extended model interface for the JTBApplication service. Represents a row in the &quot;nbp_jtb_applications&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JTBApplicationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jtb.application.form.service.model.impl.JTBApplicationImpl"
)
@ProviderType
public interface JTBApplication extends JTBApplicationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jtb.application.form.service.model.impl.JTBApplicationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JTBApplication, Long>
		JTB_APPLICATION_ID_ACCESSOR = new Accessor<JTBApplication, Long>() {

			@Override
			public Long get(JTBApplication jtbApplication) {
				return jtbApplication.getJtbApplicationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<JTBApplication> getTypeClass() {
				return JTBApplication.class;
			}

		};

}