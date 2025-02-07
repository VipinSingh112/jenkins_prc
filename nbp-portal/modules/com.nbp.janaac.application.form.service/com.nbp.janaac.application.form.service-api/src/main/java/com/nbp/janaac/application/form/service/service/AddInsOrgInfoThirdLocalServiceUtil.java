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

import com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AddInsOrgInfoThird. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AddInsOrgInfoThirdLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoThirdLocalService
 * @generated
 */
public class AddInsOrgInfoThirdLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AddInsOrgInfoThirdLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the add ins org info third to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsOrgInfoThird the add ins org info third
	 * @return the add ins org info third that was added
	 */
	public static AddInsOrgInfoThird addAddInsOrgInfoThird(
		AddInsOrgInfoThird addInsOrgInfoThird) {

		return getService().addAddInsOrgInfoThird(addInsOrgInfoThird);
	}

	/**
	 * Creates a new add ins org info third with the primary key. Does not add the add ins org info third to the database.
	 *
	 * @param AddInsOrgInfoThirdId the primary key for the new add ins org info third
	 * @return the new add ins org info third
	 */
	public static AddInsOrgInfoThird createAddInsOrgInfoThird(
		long AddInsOrgInfoThirdId) {

		return getService().createAddInsOrgInfoThird(AddInsOrgInfoThirdId);
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
	 * Deletes the add ins org info third from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsOrgInfoThird the add ins org info third
	 * @return the add ins org info third that was removed
	 */
	public static AddInsOrgInfoThird deleteAddInsOrgInfoThird(
		AddInsOrgInfoThird addInsOrgInfoThird) {

		return getService().deleteAddInsOrgInfoThird(addInsOrgInfoThird);
	}

	/**
	 * Deletes the add ins org info third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the add ins org info third
	 * @return the add ins org info third that was removed
	 * @throws PortalException if a add ins org info third with the primary key could not be found
	 */
	public static AddInsOrgInfoThird deleteAddInsOrgInfoThird(
			long AddInsOrgInfoThirdId)
		throws PortalException {

		return getService().deleteAddInsOrgInfoThird(AddInsOrgInfoThirdId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoThirdModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoThirdModelImpl</code>.
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

	public static AddInsOrgInfoThird fetchAddInsOrgInfoThird(
		long AddInsOrgInfoThirdId) {

		return getService().fetchAddInsOrgInfoThird(AddInsOrgInfoThirdId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the add ins org info third with the primary key.
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the add ins org info third
	 * @return the add ins org info third
	 * @throws PortalException if a add ins org info third with the primary key could not be found
	 */
	public static AddInsOrgInfoThird getAddInsOrgInfoThird(
			long AddInsOrgInfoThirdId)
		throws PortalException {

		return getService().getAddInsOrgInfoThird(AddInsOrgInfoThirdId);
	}

	/**
	 * Returns a range of all the add ins org info thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @return the range of add ins org info thirds
	 */
	public static List<AddInsOrgInfoThird> getAddInsOrgInfoThirds(
		int start, int end) {

		return getService().getAddInsOrgInfoThirds(start, end);
	}

	/**
	 * Returns the number of add ins org info thirds.
	 *
	 * @return the number of add ins org info thirds
	 */
	public static int getAddInsOrgInfoThirdsCount() {
		return getService().getAddInsOrgInfoThirdsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<AddInsOrgInfoThird> getJANAAC_ByApplicationId(
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
	 * Updates the add ins org info third in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsOrgInfoThird the add ins org info third
	 * @return the add ins org info third that was updated
	 */
	public static AddInsOrgInfoThird updateAddInsOrgInfoThird(
		AddInsOrgInfoThird addInsOrgInfoThird) {

		return getService().updateAddInsOrgInfoThird(addInsOrgInfoThird);
	}

	public static AddInsOrgInfoThirdLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AddInsOrgInfoThirdLocalService>
		_serviceSnapshot = new Snapshot<>(
			AddInsOrgInfoThirdLocalServiceUtil.class,
			AddInsOrgInfoThirdLocalService.class);

}