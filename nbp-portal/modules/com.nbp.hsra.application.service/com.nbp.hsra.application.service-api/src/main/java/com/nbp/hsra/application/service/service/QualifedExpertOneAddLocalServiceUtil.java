/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.QualifedExpertOneAdd;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for QualifedExpertOneAdd. This utility wraps
 * <code>com.nbp.hsra.application.service.service.impl.QualifedExpertOneAddLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QualifedExpertOneAddLocalService
 * @generated
 */
public class QualifedExpertOneAddLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.application.service.service.impl.QualifedExpertOneAddLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the qualifed expert one add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualifedExpertOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualifedExpertOneAdd the qualifed expert one add
	 * @return the qualifed expert one add that was added
	 */
	public static QualifedExpertOneAdd addQualifedExpertOneAdd(
		QualifedExpertOneAdd qualifedExpertOneAdd) {

		return getService().addQualifedExpertOneAdd(qualifedExpertOneAdd);
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
	 * Creates a new qualifed expert one add with the primary key. Does not add the qualifed expert one add to the database.
	 *
	 * @param qualifedExpertOneAddId the primary key for the new qualifed expert one add
	 * @return the new qualifed expert one add
	 */
	public static QualifedExpertOneAdd createQualifedExpertOneAdd(
		long qualifedExpertOneAddId) {

		return getService().createQualifedExpertOneAdd(qualifedExpertOneAddId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the qualifed expert one add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualifedExpertOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualifedExpertOneAddId the primary key of the qualifed expert one add
	 * @return the qualifed expert one add that was removed
	 * @throws PortalException if a qualifed expert one add with the primary key could not be found
	 */
	public static QualifedExpertOneAdd deleteQualifedExpertOneAdd(
			long qualifedExpertOneAddId)
		throws PortalException {

		return getService().deleteQualifedExpertOneAdd(qualifedExpertOneAddId);
	}

	/**
	 * Deletes the qualifed expert one add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualifedExpertOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualifedExpertOneAdd the qualifed expert one add
	 * @return the qualifed expert one add that was removed
	 */
	public static QualifedExpertOneAdd deleteQualifedExpertOneAdd(
		QualifedExpertOneAdd qualifedExpertOneAdd) {

		return getService().deleteQualifedExpertOneAdd(qualifedExpertOneAdd);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualifedExpertOneAddModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualifedExpertOneAddModelImpl</code>.
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

	public static QualifedExpertOneAdd fetchQualifedExpertOneAdd(
		long qualifedExpertOneAddId) {

		return getService().fetchQualifedExpertOneAdd(qualifedExpertOneAddId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<QualifedExpertOneAdd> getHsraById(
		long hsraApplicationId) {

		return getService().getHsraById(hsraApplicationId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
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
	 * Returns the qualifed expert one add with the primary key.
	 *
	 * @param qualifedExpertOneAddId the primary key of the qualifed expert one add
	 * @return the qualifed expert one add
	 * @throws PortalException if a qualifed expert one add with the primary key could not be found
	 */
	public static QualifedExpertOneAdd getQualifedExpertOneAdd(
			long qualifedExpertOneAddId)
		throws PortalException {

		return getService().getQualifedExpertOneAdd(qualifedExpertOneAddId);
	}

	/**
	 * Returns a range of all the qualifed expert one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualifedExpertOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert one adds
	 * @param end the upper bound of the range of qualifed expert one adds (not inclusive)
	 * @return the range of qualifed expert one adds
	 */
	public static List<QualifedExpertOneAdd> getQualifedExpertOneAdds(
		int start, int end) {

		return getService().getQualifedExpertOneAdds(start, end);
	}

	/**
	 * Returns the number of qualifed expert one adds.
	 *
	 * @return the number of qualifed expert one adds
	 */
	public static int getQualifedExpertOneAddsCount() {
		return getService().getQualifedExpertOneAddsCount();
	}

	/**
	 * Updates the qualifed expert one add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualifedExpertOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualifedExpertOneAdd the qualifed expert one add
	 * @return the qualifed expert one add that was updated
	 */
	public static QualifedExpertOneAdd updateQualifedExpertOneAdd(
		QualifedExpertOneAdd qualifedExpertOneAdd) {

		return getService().updateQualifedExpertOneAdd(qualifedExpertOneAdd);
	}

	public static QualifedExpertOneAddLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<QualifedExpertOneAddLocalService>
		_serviceSnapshot = new Snapshot<>(
			QualifedExpertOneAddLocalServiceUtil.class,
			QualifedExpertOneAddLocalService.class);

}