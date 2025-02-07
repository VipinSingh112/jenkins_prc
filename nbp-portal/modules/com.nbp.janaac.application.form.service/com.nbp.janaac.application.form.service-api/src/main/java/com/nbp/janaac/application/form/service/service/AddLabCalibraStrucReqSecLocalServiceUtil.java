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

import com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AddLabCalibraStrucReqSec. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AddLabCalibraStrucReqSecLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabCalibraStrucReqSecLocalService
 * @generated
 */
public class AddLabCalibraStrucReqSecLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AddLabCalibraStrucReqSecLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the add lab calibra struc req sec to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabCalibraStrucReqSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabCalibraStrucReqSec the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec that was added
	 */
	public static AddLabCalibraStrucReqSec addAddLabCalibraStrucReqSec(
		AddLabCalibraStrucReqSec addLabCalibraStrucReqSec) {

		return getService().addAddLabCalibraStrucReqSec(
			addLabCalibraStrucReqSec);
	}

	/**
	 * Creates a new add lab calibra struc req sec with the primary key. Does not add the add lab calibra struc req sec to the database.
	 *
	 * @param addLabCalibraStrucReqSecId the primary key for the new add lab calibra struc req sec
	 * @return the new add lab calibra struc req sec
	 */
	public static AddLabCalibraStrucReqSec createAddLabCalibraStrucReqSec(
		long addLabCalibraStrucReqSecId) {

		return getService().createAddLabCalibraStrucReqSec(
			addLabCalibraStrucReqSecId);
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
	 * Deletes the add lab calibra struc req sec from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabCalibraStrucReqSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabCalibraStrucReqSec the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec that was removed
	 */
	public static AddLabCalibraStrucReqSec deleteAddLabCalibraStrucReqSec(
		AddLabCalibraStrucReqSec addLabCalibraStrucReqSec) {

		return getService().deleteAddLabCalibraStrucReqSec(
			addLabCalibraStrucReqSec);
	}

	/**
	 * Deletes the add lab calibra struc req sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabCalibraStrucReqSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabCalibraStrucReqSecId the primary key of the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec that was removed
	 * @throws PortalException if a add lab calibra struc req sec with the primary key could not be found
	 */
	public static AddLabCalibraStrucReqSec deleteAddLabCalibraStrucReqSec(
			long addLabCalibraStrucReqSecId)
		throws PortalException {

		return getService().deleteAddLabCalibraStrucReqSec(
			addLabCalibraStrucReqSecId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabCalibraStrucReqSecModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabCalibraStrucReqSecModelImpl</code>.
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

	public static AddLabCalibraStrucReqSec fetchAddLabCalibraStrucReqSec(
		long addLabCalibraStrucReqSecId) {

		return getService().fetchAddLabCalibraStrucReqSec(
			addLabCalibraStrucReqSecId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab calibra struc req sec with the primary key.
	 *
	 * @param addLabCalibraStrucReqSecId the primary key of the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec
	 * @throws PortalException if a add lab calibra struc req sec with the primary key could not be found
	 */
	public static AddLabCalibraStrucReqSec getAddLabCalibraStrucReqSec(
			long addLabCalibraStrucReqSecId)
		throws PortalException {

		return getService().getAddLabCalibraStrucReqSec(
			addLabCalibraStrucReqSecId);
	}

	/**
	 * Returns a range of all the add lab calibra struc req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabCalibraStrucReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab calibra struc req secs
	 * @param end the upper bound of the range of add lab calibra struc req secs (not inclusive)
	 * @return the range of add lab calibra struc req secs
	 */
	public static List<AddLabCalibraStrucReqSec> getAddLabCalibraStrucReqSecs(
		int start, int end) {

		return getService().getAddLabCalibraStrucReqSecs(start, end);
	}

	/**
	 * Returns the number of add lab calibra struc req secs.
	 *
	 * @return the number of add lab calibra struc req secs
	 */
	public static int getAddLabCalibraStrucReqSecsCount() {
		return getService().getAddLabCalibraStrucReqSecsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<AddLabCalibraStrucReqSec> getJanaacById(
		long janaacApplicationId) {

		return getService().getJanaacById(janaacApplicationId);
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
	 * Updates the add lab calibra struc req sec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabCalibraStrucReqSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabCalibraStrucReqSec the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec that was updated
	 */
	public static AddLabCalibraStrucReqSec updateAddLabCalibraStrucReqSec(
		AddLabCalibraStrucReqSec addLabCalibraStrucReqSec) {

		return getService().updateAddLabCalibraStrucReqSec(
			addLabCalibraStrucReqSec);
	}

	public static AddLabCalibraStrucReqSecLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AddLabCalibraStrucReqSecLocalService>
		_serviceSnapshot = new Snapshot<>(
			AddLabCalibraStrucReqSecLocalServiceUtil.class,
			AddLabCalibraStrucReqSecLocalService.class);

}