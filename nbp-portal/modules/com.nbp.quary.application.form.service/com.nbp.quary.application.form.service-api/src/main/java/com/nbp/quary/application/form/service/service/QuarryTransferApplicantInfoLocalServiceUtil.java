/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.QuarryTransferApplicantInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for QuarryTransferApplicantInfo. This utility wraps
 * <code>com.nbp.quary.application.form.service.service.impl.QuarryTransferApplicantInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryTransferApplicantInfoLocalService
 * @generated
 */
public class QuarryTransferApplicantInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.quary.application.form.service.service.impl.QuarryTransferApplicantInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the quarry transfer applicant info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryTransferApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryTransferApplicantInfo the quarry transfer applicant info
	 * @return the quarry transfer applicant info that was added
	 */
	public static QuarryTransferApplicantInfo addQuarryTransferApplicantInfo(
		QuarryTransferApplicantInfo quarryTransferApplicantInfo) {

		return getService().addQuarryTransferApplicantInfo(
			quarryTransferApplicantInfo);
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
	 * Creates a new quarry transfer applicant info with the primary key. Does not add the quarry transfer applicant info to the database.
	 *
	 * @param quarryTransferInfoId the primary key for the new quarry transfer applicant info
	 * @return the new quarry transfer applicant info
	 */
	public static QuarryTransferApplicantInfo createQuarryTransferApplicantInfo(
		long quarryTransferInfoId) {

		return getService().createQuarryTransferApplicantInfo(
			quarryTransferInfoId);
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
	 * Deletes the quarry transfer applicant info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryTransferApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryTransferInfoId the primary key of the quarry transfer applicant info
	 * @return the quarry transfer applicant info that was removed
	 * @throws PortalException if a quarry transfer applicant info with the primary key could not be found
	 */
	public static QuarryTransferApplicantInfo deleteQuarryTransferApplicantInfo(
			long quarryTransferInfoId)
		throws PortalException {

		return getService().deleteQuarryTransferApplicantInfo(
			quarryTransferInfoId);
	}

	/**
	 * Deletes the quarry transfer applicant info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryTransferApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryTransferApplicantInfo the quarry transfer applicant info
	 * @return the quarry transfer applicant info that was removed
	 */
	public static QuarryTransferApplicantInfo deleteQuarryTransferApplicantInfo(
		QuarryTransferApplicantInfo quarryTransferApplicantInfo) {

		return getService().deleteQuarryTransferApplicantInfo(
			quarryTransferApplicantInfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryTransferApplicantInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryTransferApplicantInfoModelImpl</code>.
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

	public static QuarryTransferApplicantInfo fetchQuarryTransferApplicantInfo(
		long quarryTransferInfoId) {

		return getService().fetchQuarryTransferApplicantInfo(
			quarryTransferInfoId);
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
	 * Returns the quarry transfer applicant info with the primary key.
	 *
	 * @param quarryTransferInfoId the primary key of the quarry transfer applicant info
	 * @return the quarry transfer applicant info
	 * @throws PortalException if a quarry transfer applicant info with the primary key could not be found
	 */
	public static QuarryTransferApplicantInfo getQuarryTransferApplicantInfo(
			long quarryTransferInfoId)
		throws PortalException {

		return getService().getQuarryTransferApplicantInfo(
			quarryTransferInfoId);
	}

	public static QuarryTransferApplicantInfo
			getQuarryTransferApplicantInfoBy_Id(long quarryAppId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryTransferApplicantInfoException {

		return getService().getQuarryTransferApplicantInfoBy_Id(quarryAppId);
	}

	/**
	 * Returns a range of all the quarry transfer applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryTransferApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry transfer applicant infos
	 * @param end the upper bound of the range of quarry transfer applicant infos (not inclusive)
	 * @return the range of quarry transfer applicant infos
	 */
	public static List<QuarryTransferApplicantInfo>
		getQuarryTransferApplicantInfos(int start, int end) {

		return getService().getQuarryTransferApplicantInfos(start, end);
	}

	/**
	 * Returns the number of quarry transfer applicant infos.
	 *
	 * @return the number of quarry transfer applicant infos
	 */
	public static int getQuarryTransferApplicantInfosCount() {
		return getService().getQuarryTransferApplicantInfosCount();
	}

	/**
	 * Updates the quarry transfer applicant info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryTransferApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryTransferApplicantInfo the quarry transfer applicant info
	 * @return the quarry transfer applicant info that was updated
	 */
	public static QuarryTransferApplicantInfo updateQuarryTransferApplicantInfo(
		QuarryTransferApplicantInfo quarryTransferApplicantInfo) {

		return getService().updateQuarryTransferApplicantInfo(
			quarryTransferApplicantInfo);
	}

	public static QuarryTransferApplicantInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<QuarryTransferApplicantInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			QuarryTransferApplicantInfoLocalServiceUtil.class,
			QuarryTransferApplicantInfoLocalService.class);

}