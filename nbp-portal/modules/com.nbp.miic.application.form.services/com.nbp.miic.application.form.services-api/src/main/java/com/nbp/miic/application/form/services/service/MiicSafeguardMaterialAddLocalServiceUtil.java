/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiicSafeguardMaterialAdd. This utility wraps
 * <code>com.nbp.miic.application.form.services.service.impl.MiicSafeguardMaterialAddLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardMaterialAddLocalService
 * @generated
 */
public class MiicSafeguardMaterialAddLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.miic.application.form.services.service.impl.MiicSafeguardMaterialAddLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the miic safeguard material add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardMaterialAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardMaterialAdd the miic safeguard material add
	 * @return the miic safeguard material add that was added
	 */
	public static MiicSafeguardMaterialAdd addMiicSafeguardMaterialAdd(
		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {

		return getService().addMiicSafeguardMaterialAdd(
			miicSafeguardMaterialAdd);
	}

	/**
	 * Creates a new miic safeguard material add with the primary key. Does not add the miic safeguard material add to the database.
	 *
	 * @param miicSafeguardMaterialAddId the primary key for the new miic safeguard material add
	 * @return the new miic safeguard material add
	 */
	public static MiicSafeguardMaterialAdd createMiicSafeguardMaterialAdd(
		long miicSafeguardMaterialAddId) {

		return getService().createMiicSafeguardMaterialAdd(
			miicSafeguardMaterialAddId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the miic safeguard material add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardMaterialAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardMaterialAddId the primary key of the miic safeguard material add
	 * @return the miic safeguard material add that was removed
	 * @throws PortalException if a miic safeguard material add with the primary key could not be found
	 */
	public static MiicSafeguardMaterialAdd deleteMiicSafeguardMaterialAdd(
			long miicSafeguardMaterialAddId)
		throws PortalException {

		return getService().deleteMiicSafeguardMaterialAdd(
			miicSafeguardMaterialAddId);
	}

	/**
	 * Deletes the miic safeguard material add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardMaterialAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardMaterialAdd the miic safeguard material add
	 * @return the miic safeguard material add that was removed
	 */
	public static MiicSafeguardMaterialAdd deleteMiicSafeguardMaterialAdd(
		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {

		return getService().deleteMiicSafeguardMaterialAdd(
			miicSafeguardMaterialAdd);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static MiicSafeguardMaterialAdd fetchMiicSafeguardMaterialAdd(
		long miicSafeguardMaterialAddId) {

		return getService().fetchMiicSafeguardMaterialAdd(
			miicSafeguardMaterialAddId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<MiicSafeguardMaterialAdd> getMiicById(
		long applicationId) {

		return getService().getMiicById(applicationId);
	}

	/**
	 * Returns the miic safeguard material add with the primary key.
	 *
	 * @param miicSafeguardMaterialAddId the primary key of the miic safeguard material add
	 * @return the miic safeguard material add
	 * @throws PortalException if a miic safeguard material add with the primary key could not be found
	 */
	public static MiicSafeguardMaterialAdd getMiicSafeguardMaterialAdd(
			long miicSafeguardMaterialAddId)
		throws PortalException {

		return getService().getMiicSafeguardMaterialAdd(
			miicSafeguardMaterialAddId);
	}

	/**
	 * Returns a range of all the miic safeguard material adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @return the range of miic safeguard material adds
	 */
	public static List<MiicSafeguardMaterialAdd> getMiicSafeguardMaterialAdds(
		int start, int end) {

		return getService().getMiicSafeguardMaterialAdds(start, end);
	}

	/**
	 * Returns the number of miic safeguard material adds.
	 *
	 * @return the number of miic safeguard material adds
	 */
	public static int getMiicSafeguardMaterialAddsCount() {
		return getService().getMiicSafeguardMaterialAddsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the miic safeguard material add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardMaterialAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardMaterialAdd the miic safeguard material add
	 * @return the miic safeguard material add that was updated
	 */
	public static MiicSafeguardMaterialAdd updateMiicSafeguardMaterialAdd(
		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {

		return getService().updateMiicSafeguardMaterialAdd(
			miicSafeguardMaterialAdd);
	}

	public static MiicSafeguardMaterialAddLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiicSafeguardMaterialAddLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiicSafeguardMaterialAddLocalServiceUtil.class,
			MiicSafeguardMaterialAddLocalService.class);

}