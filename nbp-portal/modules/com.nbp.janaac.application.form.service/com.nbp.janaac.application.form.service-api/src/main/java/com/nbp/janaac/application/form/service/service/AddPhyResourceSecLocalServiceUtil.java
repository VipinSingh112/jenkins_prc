/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddPhyResourceSec;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AddPhyResourceSec. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AddPhyResourceSecLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceSecLocalService
 * @generated
 */
public class AddPhyResourceSecLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AddPhyResourceSecLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the add phy resource sec to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddPhyResourceSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addPhyResourceSec the add phy resource sec
	 * @return the add phy resource sec that was added
	 */
	public static AddPhyResourceSec addAddPhyResourceSec(
		AddPhyResourceSec addPhyResourceSec) {

		return getService().addAddPhyResourceSec(addPhyResourceSec);
	}

	/**
	 * Creates a new add phy resource sec with the primary key. Does not add the add phy resource sec to the database.
	 *
	 * @param addPhyResourceSecId the primary key for the new add phy resource sec
	 * @return the new add phy resource sec
	 */
	public static AddPhyResourceSec createAddPhyResourceSec(
		long addPhyResourceSecId) {

		return getService().createAddPhyResourceSec(addPhyResourceSecId);
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
	 * Deletes the add phy resource sec from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddPhyResourceSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addPhyResourceSec the add phy resource sec
	 * @return the add phy resource sec that was removed
	 */
	public static AddPhyResourceSec deleteAddPhyResourceSec(
		AddPhyResourceSec addPhyResourceSec) {

		return getService().deleteAddPhyResourceSec(addPhyResourceSec);
	}

	/**
	 * Deletes the add phy resource sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddPhyResourceSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addPhyResourceSecId the primary key of the add phy resource sec
	 * @return the add phy resource sec that was removed
	 * @throws PortalException if a add phy resource sec with the primary key could not be found
	 */
	public static AddPhyResourceSec deleteAddPhyResourceSec(
			long addPhyResourceSecId)
		throws PortalException {

		return getService().deleteAddPhyResourceSec(addPhyResourceSecId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddPhyResourceSecModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddPhyResourceSecModelImpl</code>.
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

	public static AddPhyResourceSec fetchAddPhyResourceSec(
		long addPhyResourceSecId) {

		return getService().fetchAddPhyResourceSec(addPhyResourceSecId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the add phy resource sec with the primary key.
	 *
	 * @param addPhyResourceSecId the primary key of the add phy resource sec
	 * @return the add phy resource sec
	 * @throws PortalException if a add phy resource sec with the primary key could not be found
	 */
	public static AddPhyResourceSec getAddPhyResourceSec(
			long addPhyResourceSecId)
		throws PortalException {

		return getService().getAddPhyResourceSec(addPhyResourceSecId);
	}

	/**
	 * Returns a range of all the add phy resource secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @return the range of add phy resource secs
	 */
	public static List<AddPhyResourceSec> getAddPhyResourceSecs(
		int start, int end) {

		return getService().getAddPhyResourceSecs(start, end);
	}

	/**
	 * Returns the number of add phy resource secs.
	 *
	 * @return the number of add phy resource secs
	 */
	public static int getAddPhyResourceSecsCount() {
		return getService().getAddPhyResourceSecsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<AddPhyResourceSec> getJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getService().getJANAAC_ByApplicationId(janaacApplicationId);
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
	 * Updates the add phy resource sec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddPhyResourceSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addPhyResourceSec the add phy resource sec
	 * @return the add phy resource sec that was updated
	 */
	public static AddPhyResourceSec updateAddPhyResourceSec(
		AddPhyResourceSec addPhyResourceSec) {

		return getService().updateAddPhyResourceSec(addPhyResourceSec);
	}

	public static AddPhyResourceSecLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AddPhyResourceSecLocalService>
		_serviceSnapshot = new Snapshot<>(
			AddPhyResourceSecLocalServiceUtil.class,
			AddPhyResourceSecLocalService.class);

}