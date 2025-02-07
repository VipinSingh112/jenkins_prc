/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ogt.application.form.services.model.OgtClaimToSpouse;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OgtClaimToSpouse. This utility wraps
 * <code>com.nbp.ogt.application.form.services.service.impl.OgtClaimToSpouseLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimToSpouseLocalService
 * @generated
 */
public class OgtClaimToSpouseLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ogt.application.form.services.service.impl.OgtClaimToSpouseLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ogt claim to spouse to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimToSpouseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimToSpouse the ogt claim to spouse
	 * @return the ogt claim to spouse that was added
	 */
	public static OgtClaimToSpouse addOgtClaimToSpouse(
		OgtClaimToSpouse ogtClaimToSpouse) {

		return getService().addOgtClaimToSpouse(ogtClaimToSpouse);
	}

	/**
	 * Creates a new ogt claim to spouse with the primary key. Does not add the ogt claim to spouse to the database.
	 *
	 * @param ogtClaimToSpouseId the primary key for the new ogt claim to spouse
	 * @return the new ogt claim to spouse
	 */
	public static OgtClaimToSpouse createOgtClaimToSpouse(
		long ogtClaimToSpouseId) {

		return getService().createOgtClaimToSpouse(ogtClaimToSpouseId);
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
	 * Deletes the ogt claim to spouse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimToSpouseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimToSpouseId the primary key of the ogt claim to spouse
	 * @return the ogt claim to spouse that was removed
	 * @throws PortalException if a ogt claim to spouse with the primary key could not be found
	 */
	public static OgtClaimToSpouse deleteOgtClaimToSpouse(
			long ogtClaimToSpouseId)
		throws PortalException {

		return getService().deleteOgtClaimToSpouse(ogtClaimToSpouseId);
	}

	/**
	 * Deletes the ogt claim to spouse from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimToSpouseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimToSpouse the ogt claim to spouse
	 * @return the ogt claim to spouse that was removed
	 */
	public static OgtClaimToSpouse deleteOgtClaimToSpouse(
		OgtClaimToSpouse ogtClaimToSpouse) {

		return getService().deleteOgtClaimToSpouse(ogtClaimToSpouse);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimToSpouseModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimToSpouseModelImpl</code>.
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

	public static OgtClaimToSpouse fetchOgtClaimToSpouse(
		long ogtClaimToSpouseId) {

		return getService().fetchOgtClaimToSpouse(ogtClaimToSpouseId);
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

	public static OgtClaimToSpouse getOgtById(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtClaimToSpouseException {

		return getService().getOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt claim to spouse with the primary key.
	 *
	 * @param ogtClaimToSpouseId the primary key of the ogt claim to spouse
	 * @return the ogt claim to spouse
	 * @throws PortalException if a ogt claim to spouse with the primary key could not be found
	 */
	public static OgtClaimToSpouse getOgtClaimToSpouse(long ogtClaimToSpouseId)
		throws PortalException {

		return getService().getOgtClaimToSpouse(ogtClaimToSpouseId);
	}

	/**
	 * Returns a range of all the ogt claim to spouses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimToSpouseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to spouses
	 * @param end the upper bound of the range of ogt claim to spouses (not inclusive)
	 * @return the range of ogt claim to spouses
	 */
	public static List<OgtClaimToSpouse> getOgtClaimToSpouses(
		int start, int end) {

		return getService().getOgtClaimToSpouses(start, end);
	}

	/**
	 * Returns the number of ogt claim to spouses.
	 *
	 * @return the number of ogt claim to spouses
	 */
	public static int getOgtClaimToSpousesCount() {
		return getService().getOgtClaimToSpousesCount();
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
	 * Updates the ogt claim to spouse in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimToSpouseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimToSpouse the ogt claim to spouse
	 * @return the ogt claim to spouse that was updated
	 */
	public static OgtClaimToSpouse updateOgtClaimToSpouse(
		OgtClaimToSpouse ogtClaimToSpouse) {

		return getService().updateOgtClaimToSpouse(ogtClaimToSpouse);
	}

	public static OgtClaimToSpouseLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OgtClaimToSpouseLocalService>
		_serviceSnapshot = new Snapshot<>(
			OgtClaimToSpouseLocalServiceUtil.class,
			OgtClaimToSpouseLocalService.class);

}