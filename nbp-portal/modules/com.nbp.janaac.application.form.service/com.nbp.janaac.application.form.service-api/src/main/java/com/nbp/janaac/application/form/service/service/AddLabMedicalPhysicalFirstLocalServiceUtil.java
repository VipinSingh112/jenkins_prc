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

import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirst;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AddLabMedicalPhysicalFirst. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AddLabMedicalPhysicalFirstLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalPhysicalFirstLocalService
 * @generated
 */
public class AddLabMedicalPhysicalFirstLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AddLabMedicalPhysicalFirstLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the add lab medical physical first to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalPhysicalFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalPhysicalFirst the add lab medical physical first
	 * @return the add lab medical physical first that was added
	 */
	public static AddLabMedicalPhysicalFirst addAddLabMedicalPhysicalFirst(
		AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst) {

		return getService().addAddLabMedicalPhysicalFirst(
			addLabMedicalPhysicalFirst);
	}

	/**
	 * Creates a new add lab medical physical first with the primary key. Does not add the add lab medical physical first to the database.
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key for the new add lab medical physical first
	 * @return the new add lab medical physical first
	 */
	public static AddLabMedicalPhysicalFirst createAddLabMedicalPhysicalFirst(
		long addLabMedicalPhysicalFirstId) {

		return getService().createAddLabMedicalPhysicalFirst(
			addLabMedicalPhysicalFirstId);
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
	 * Deletes the add lab medical physical first from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalPhysicalFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalPhysicalFirst the add lab medical physical first
	 * @return the add lab medical physical first that was removed
	 */
	public static AddLabMedicalPhysicalFirst deleteAddLabMedicalPhysicalFirst(
		AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst) {

		return getService().deleteAddLabMedicalPhysicalFirst(
			addLabMedicalPhysicalFirst);
	}

	/**
	 * Deletes the add lab medical physical first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalPhysicalFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key of the add lab medical physical first
	 * @return the add lab medical physical first that was removed
	 * @throws PortalException if a add lab medical physical first with the primary key could not be found
	 */
	public static AddLabMedicalPhysicalFirst deleteAddLabMedicalPhysicalFirst(
			long addLabMedicalPhysicalFirstId)
		throws PortalException {

		return getService().deleteAddLabMedicalPhysicalFirst(
			addLabMedicalPhysicalFirstId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalPhysicalFirstModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalPhysicalFirstModelImpl</code>.
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

	public static AddLabMedicalPhysicalFirst fetchAddLabMedicalPhysicalFirst(
		long addLabMedicalPhysicalFirstId) {

		return getService().fetchAddLabMedicalPhysicalFirst(
			addLabMedicalPhysicalFirstId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab medical physical first with the primary key.
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key of the add lab medical physical first
	 * @return the add lab medical physical first
	 * @throws PortalException if a add lab medical physical first with the primary key could not be found
	 */
	public static AddLabMedicalPhysicalFirst getAddLabMedicalPhysicalFirst(
			long addLabMedicalPhysicalFirstId)
		throws PortalException {

		return getService().getAddLabMedicalPhysicalFirst(
			addLabMedicalPhysicalFirstId);
	}

	/**
	 * Returns a range of all the add lab medical physical firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalPhysicalFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical firsts
	 * @param end the upper bound of the range of add lab medical physical firsts (not inclusive)
	 * @return the range of add lab medical physical firsts
	 */
	public static List<AddLabMedicalPhysicalFirst>
		getAddLabMedicalPhysicalFirsts(int start, int end) {

		return getService().getAddLabMedicalPhysicalFirsts(start, end);
	}

	/**
	 * Returns the number of add lab medical physical firsts.
	 *
	 * @return the number of add lab medical physical firsts
	 */
	public static int getAddLabMedicalPhysicalFirstsCount() {
		return getService().getAddLabMedicalPhysicalFirstsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<AddLabMedicalPhysicalFirst> getJanaacById(
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
	 * Updates the add lab medical physical first in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalPhysicalFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalPhysicalFirst the add lab medical physical first
	 * @return the add lab medical physical first that was updated
	 */
	public static AddLabMedicalPhysicalFirst updateAddLabMedicalPhysicalFirst(
		AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst) {

		return getService().updateAddLabMedicalPhysicalFirst(
			addLabMedicalPhysicalFirst);
	}

	public static AddLabMedicalPhysicalFirstLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AddLabMedicalPhysicalFirstLocalService>
		_serviceSnapshot = new Snapshot<>(
			AddLabMedicalPhysicalFirstLocalServiceUtil.class,
			AddLabMedicalPhysicalFirstLocalService.class);

}