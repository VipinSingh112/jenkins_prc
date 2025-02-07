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

import com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AddLabMedicalDescOfActiSec. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AddLabMedicalDescOfActiSecLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalDescOfActiSecLocalService
 * @generated
 */
public class AddLabMedicalDescOfActiSecLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AddLabMedicalDescOfActiSecLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the add lab medical desc of acti sec to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalDescOfActiSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalDescOfActiSec the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec that was added
	 */
	public static AddLabMedicalDescOfActiSec addAddLabMedicalDescOfActiSec(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		return getService().addAddLabMedicalDescOfActiSec(
			addLabMedicalDescOfActiSec);
	}

	/**
	 * Creates a new add lab medical desc of acti sec with the primary key. Does not add the add lab medical desc of acti sec to the database.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key for the new add lab medical desc of acti sec
	 * @return the new add lab medical desc of acti sec
	 */
	public static AddLabMedicalDescOfActiSec createAddLabMedicalDescOfActiSec(
		long addLabMedicalDescOfActiSecId) {

		return getService().createAddLabMedicalDescOfActiSec(
			addLabMedicalDescOfActiSecId);
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
	 * Deletes the add lab medical desc of acti sec from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalDescOfActiSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalDescOfActiSec the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec that was removed
	 */
	public static AddLabMedicalDescOfActiSec deleteAddLabMedicalDescOfActiSec(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		return getService().deleteAddLabMedicalDescOfActiSec(
			addLabMedicalDescOfActiSec);
	}

	/**
	 * Deletes the add lab medical desc of acti sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalDescOfActiSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec that was removed
	 * @throws PortalException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	public static AddLabMedicalDescOfActiSec deleteAddLabMedicalDescOfActiSec(
			long addLabMedicalDescOfActiSecId)
		throws PortalException {

		return getService().deleteAddLabMedicalDescOfActiSec(
			addLabMedicalDescOfActiSecId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalDescOfActiSecModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalDescOfActiSecModelImpl</code>.
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

	public static AddLabMedicalDescOfActiSec fetchAddLabMedicalDescOfActiSec(
		long addLabMedicalDescOfActiSecId) {

		return getService().fetchAddLabMedicalDescOfActiSec(
			addLabMedicalDescOfActiSecId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab medical desc of acti sec with the primary key.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec
	 * @throws PortalException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	public static AddLabMedicalDescOfActiSec getAddLabMedicalDescOfActiSec(
			long addLabMedicalDescOfActiSecId)
		throws PortalException {

		return getService().getAddLabMedicalDescOfActiSec(
			addLabMedicalDescOfActiSecId);
	}

	/**
	 * Returns a range of all the add lab medical desc of acti secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @return the range of add lab medical desc of acti secs
	 */
	public static List<AddLabMedicalDescOfActiSec>
		getAddLabMedicalDescOfActiSecs(int start, int end) {

		return getService().getAddLabMedicalDescOfActiSecs(start, end);
	}

	/**
	 * Returns the number of add lab medical desc of acti secs.
	 *
	 * @return the number of add lab medical desc of acti secs
	 */
	public static int getAddLabMedicalDescOfActiSecsCount() {
		return getService().getAddLabMedicalDescOfActiSecsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<AddLabMedicalDescOfActiSec> getJanaacById(
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
	 * Updates the add lab medical desc of acti sec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalDescOfActiSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalDescOfActiSec the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec that was updated
	 */
	public static AddLabMedicalDescOfActiSec updateAddLabMedicalDescOfActiSec(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		return getService().updateAddLabMedicalDescOfActiSec(
			addLabMedicalDescOfActiSec);
	}

	public static AddLabMedicalDescOfActiSecLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AddLabMedicalDescOfActiSecLocalService>
		_serviceSnapshot = new Snapshot<>(
			AddLabMedicalDescOfActiSecLocalServiceUtil.class,
			AddLabMedicalDescOfActiSecLocalService.class);

}