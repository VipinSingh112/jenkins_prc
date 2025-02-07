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

import com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AddLabMedicalOrganFirst. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AddLabMedicalOrganFirstLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalOrganFirstLocalService
 * @generated
 */
public class AddLabMedicalOrganFirstLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AddLabMedicalOrganFirstLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the add lab medical organ first to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalOrganFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalOrganFirst the add lab medical organ first
	 * @return the add lab medical organ first that was added
	 */
	public static AddLabMedicalOrganFirst addAddLabMedicalOrganFirst(
		AddLabMedicalOrganFirst addLabMedicalOrganFirst) {

		return getService().addAddLabMedicalOrganFirst(addLabMedicalOrganFirst);
	}

	/**
	 * Creates a new add lab medical organ first with the primary key. Does not add the add lab medical organ first to the database.
	 *
	 * @param addLabMedicalOrganFirstId the primary key for the new add lab medical organ first
	 * @return the new add lab medical organ first
	 */
	public static AddLabMedicalOrganFirst createAddLabMedicalOrganFirst(
		long addLabMedicalOrganFirstId) {

		return getService().createAddLabMedicalOrganFirst(
			addLabMedicalOrganFirstId);
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
	 * Deletes the add lab medical organ first from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalOrganFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalOrganFirst the add lab medical organ first
	 * @return the add lab medical organ first that was removed
	 */
	public static AddLabMedicalOrganFirst deleteAddLabMedicalOrganFirst(
		AddLabMedicalOrganFirst addLabMedicalOrganFirst) {

		return getService().deleteAddLabMedicalOrganFirst(
			addLabMedicalOrganFirst);
	}

	/**
	 * Deletes the add lab medical organ first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalOrganFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalOrganFirstId the primary key of the add lab medical organ first
	 * @return the add lab medical organ first that was removed
	 * @throws PortalException if a add lab medical organ first with the primary key could not be found
	 */
	public static AddLabMedicalOrganFirst deleteAddLabMedicalOrganFirst(
			long addLabMedicalOrganFirstId)
		throws PortalException {

		return getService().deleteAddLabMedicalOrganFirst(
			addLabMedicalOrganFirstId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganFirstModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganFirstModelImpl</code>.
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

	public static AddLabMedicalOrganFirst fetchAddLabMedicalOrganFirst(
		long addLabMedicalOrganFirstId) {

		return getService().fetchAddLabMedicalOrganFirst(
			addLabMedicalOrganFirstId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab medical organ first with the primary key.
	 *
	 * @param addLabMedicalOrganFirstId the primary key of the add lab medical organ first
	 * @return the add lab medical organ first
	 * @throws PortalException if a add lab medical organ first with the primary key could not be found
	 */
	public static AddLabMedicalOrganFirst getAddLabMedicalOrganFirst(
			long addLabMedicalOrganFirstId)
		throws PortalException {

		return getService().getAddLabMedicalOrganFirst(
			addLabMedicalOrganFirstId);
	}

	/**
	 * Returns a range of all the add lab medical organ firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ firsts
	 * @param end the upper bound of the range of add lab medical organ firsts (not inclusive)
	 * @return the range of add lab medical organ firsts
	 */
	public static List<AddLabMedicalOrganFirst> getAddLabMedicalOrganFirsts(
		int start, int end) {

		return getService().getAddLabMedicalOrganFirsts(start, end);
	}

	/**
	 * Returns the number of add lab medical organ firsts.
	 *
	 * @return the number of add lab medical organ firsts
	 */
	public static int getAddLabMedicalOrganFirstsCount() {
		return getService().getAddLabMedicalOrganFirstsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<AddLabMedicalOrganFirst> getJanaacById(
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
	 * Updates the add lab medical organ first in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalOrganFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalOrganFirst the add lab medical organ first
	 * @return the add lab medical organ first that was updated
	 */
	public static AddLabMedicalOrganFirst updateAddLabMedicalOrganFirst(
		AddLabMedicalOrganFirst addLabMedicalOrganFirst) {

		return getService().updateAddLabMedicalOrganFirst(
			addLabMedicalOrganFirst);
	}

	public static AddLabMedicalOrganFirstLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AddLabMedicalOrganFirstLocalService>
		_serviceSnapshot = new Snapshot<>(
			AddLabMedicalOrganFirstLocalServiceUtil.class,
			AddLabMedicalOrganFirstLocalService.class);

}