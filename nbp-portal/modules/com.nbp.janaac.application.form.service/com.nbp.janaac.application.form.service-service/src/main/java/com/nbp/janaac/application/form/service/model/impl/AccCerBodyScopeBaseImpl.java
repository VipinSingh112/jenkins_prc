/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.nbp.janaac.application.form.service.model.AccCerBodyScope;
import com.nbp.janaac.application.form.service.service.AccCerBodyScopeLocalServiceUtil;

/**
 * The extended model base implementation for the AccCerBodyScope service. Represents a row in the &quot;nbp_janaac_acc_cer_scope&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AccCerBodyScopeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyScopeImpl
 * @see AccCerBodyScope
 * @generated
 */
public abstract class AccCerBodyScopeBaseImpl
	extends AccCerBodyScopeModelImpl implements AccCerBodyScope {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a acc cer body scope model instance should use the <code>AccCerBodyScope</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AccCerBodyScopeLocalServiceUtil.addAccCerBodyScope(this);
		}
		else {
			AccCerBodyScopeLocalServiceUtil.updateAccCerBodyScope(this);
		}
	}

}