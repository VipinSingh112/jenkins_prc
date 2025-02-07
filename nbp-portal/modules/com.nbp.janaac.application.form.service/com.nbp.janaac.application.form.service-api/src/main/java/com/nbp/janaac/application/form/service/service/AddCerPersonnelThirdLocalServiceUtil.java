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

import com.nbp.janaac.application.form.service.model.AddCerPersonnelThird;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AddCerPersonnelThird. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AddCerPersonnelThirdLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelThirdLocalService
 * @generated
 */
public class AddCerPersonnelThirdLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AddCerPersonnelThirdLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the add cer personnel third to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelThird the add cer personnel third
	 * @return the add cer personnel third that was added
	 */
	public static AddCerPersonnelThird addAddCerPersonnelThird(
		AddCerPersonnelThird addCerPersonnelThird) {

		return getService().addAddCerPersonnelThird(addCerPersonnelThird);
	}

	/**
	 * Creates a new add cer personnel third with the primary key. Does not add the add cer personnel third to the database.
	 *
	 * @param addCerPersonnelThirdId the primary key for the new add cer personnel third
	 * @return the new add cer personnel third
	 */
	public static AddCerPersonnelThird createAddCerPersonnelThird(
		long addCerPersonnelThirdId) {

		return getService().createAddCerPersonnelThird(addCerPersonnelThirdId);
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
	 * Deletes the add cer personnel third from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelThird the add cer personnel third
	 * @return the add cer personnel third that was removed
	 */
	public static AddCerPersonnelThird deleteAddCerPersonnelThird(
		AddCerPersonnelThird addCerPersonnelThird) {

		return getService().deleteAddCerPersonnelThird(addCerPersonnelThird);
	}

	/**
	 * Deletes the add cer personnel third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelThirdId the primary key of the add cer personnel third
	 * @return the add cer personnel third that was removed
	 * @throws PortalException if a add cer personnel third with the primary key could not be found
	 */
	public static AddCerPersonnelThird deleteAddCerPersonnelThird(
			long addCerPersonnelThirdId)
		throws PortalException {

		return getService().deleteAddCerPersonnelThird(addCerPersonnelThirdId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelThirdModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelThirdModelImpl</code>.
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

	public static AddCerPersonnelThird fetchAddCerPersonnelThird(
		long addCerPersonnelThirdId) {

		return getService().fetchAddCerPersonnelThird(addCerPersonnelThirdId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the add cer personnel third with the primary key.
	 *
	 * @param addCerPersonnelThirdId the primary key of the add cer personnel third
	 * @return the add cer personnel third
	 * @throws PortalException if a add cer personnel third with the primary key could not be found
	 */
	public static AddCerPersonnelThird getAddCerPersonnelThird(
			long addCerPersonnelThirdId)
		throws PortalException {

		return getService().getAddCerPersonnelThird(addCerPersonnelThirdId);
	}

	/**
	 * Returns a range of all the add cer personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @return the range of add cer personnel thirds
	 */
	public static List<AddCerPersonnelThird> getAddCerPersonnelThirds(
		int start, int end) {

		return getService().getAddCerPersonnelThirds(start, end);
	}

	/**
	 * Returns the number of add cer personnel thirds.
	 *
	 * @return the number of add cer personnel thirds
	 */
	public static int getAddCerPersonnelThirdsCount() {
		return getService().getAddCerPersonnelThirdsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<AddCerPersonnelThird> getJANAAC_ByApplicationId(
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
	 * Updates the add cer personnel third in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelThird the add cer personnel third
	 * @return the add cer personnel third that was updated
	 */
	public static AddCerPersonnelThird updateAddCerPersonnelThird(
		AddCerPersonnelThird addCerPersonnelThird) {

		return getService().updateAddCerPersonnelThird(addCerPersonnelThird);
	}

	public static AddCerPersonnelThirdLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AddCerPersonnelThirdLocalService>
		_serviceSnapshot = new Snapshot<>(
			AddCerPersonnelThirdLocalServiceUtil.class,
			AddCerPersonnelThirdLocalService.class);

}