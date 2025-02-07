/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QuarryTransferApplicantInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryTransferApplicantInfoLocalService
 * @generated
 */
public class QuarryTransferApplicantInfoLocalServiceWrapper
	implements QuarryTransferApplicantInfoLocalService,
			   ServiceWrapper<QuarryTransferApplicantInfoLocalService> {

	public QuarryTransferApplicantInfoLocalServiceWrapper() {
		this(null);
	}

	public QuarryTransferApplicantInfoLocalServiceWrapper(
		QuarryTransferApplicantInfoLocalService
			quarryTransferApplicantInfoLocalService) {

		_quarryTransferApplicantInfoLocalService =
			quarryTransferApplicantInfoLocalService;
	}

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
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryTransferApplicantInfo
			addQuarryTransferApplicantInfo(
				com.nbp.quary.application.form.service.model.
					QuarryTransferApplicantInfo quarryTransferApplicantInfo) {

		return _quarryTransferApplicantInfoLocalService.
			addQuarryTransferApplicantInfo(quarryTransferApplicantInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryTransferApplicantInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quarry transfer applicant info with the primary key. Does not add the quarry transfer applicant info to the database.
	 *
	 * @param quarryTransferInfoId the primary key for the new quarry transfer applicant info
	 * @return the new quarry transfer applicant info
	 */
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryTransferApplicantInfo
			createQuarryTransferApplicantInfo(long quarryTransferInfoId) {

		return _quarryTransferApplicantInfoLocalService.
			createQuarryTransferApplicantInfo(quarryTransferInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryTransferApplicantInfoLocalService.deletePersistedModel(
			persistedModel);
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
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryTransferApplicantInfo
				deleteQuarryTransferApplicantInfo(long quarryTransferInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryTransferApplicantInfoLocalService.
			deleteQuarryTransferApplicantInfo(quarryTransferInfoId);
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
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryTransferApplicantInfo
			deleteQuarryTransferApplicantInfo(
				com.nbp.quary.application.form.service.model.
					QuarryTransferApplicantInfo quarryTransferApplicantInfo) {

		return _quarryTransferApplicantInfoLocalService.
			deleteQuarryTransferApplicantInfo(quarryTransferApplicantInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quarryTransferApplicantInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quarryTransferApplicantInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quarryTransferApplicantInfoLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _quarryTransferApplicantInfoLocalService.dynamicQuery(
			dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _quarryTransferApplicantInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _quarryTransferApplicantInfoLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _quarryTransferApplicantInfoLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _quarryTransferApplicantInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryTransferApplicantInfo
			fetchQuarryTransferApplicantInfo(long quarryTransferInfoId) {

		return _quarryTransferApplicantInfoLocalService.
			fetchQuarryTransferApplicantInfo(quarryTransferInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quarryTransferApplicantInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quarryTransferApplicantInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryTransferApplicantInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryTransferApplicantInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the quarry transfer applicant info with the primary key.
	 *
	 * @param quarryTransferInfoId the primary key of the quarry transfer applicant info
	 * @return the quarry transfer applicant info
	 * @throws PortalException if a quarry transfer applicant info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryTransferApplicantInfo
				getQuarryTransferApplicantInfo(long quarryTransferInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryTransferApplicantInfoLocalService.
			getQuarryTransferApplicantInfo(quarryTransferInfoId);
	}

	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryTransferApplicantInfo
				getQuarryTransferApplicantInfoBy_Id(long quarryAppId)
			throws com.nbp.quary.application.form.service.exception.
				NoSuchQuarryTransferApplicantInfoException {

		return _quarryTransferApplicantInfoLocalService.
			getQuarryTransferApplicantInfoBy_Id(quarryAppId);
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
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.
			QuarryTransferApplicantInfo> getQuarryTransferApplicantInfos(
				int start, int end) {

		return _quarryTransferApplicantInfoLocalService.
			getQuarryTransferApplicantInfos(start, end);
	}

	/**
	 * Returns the number of quarry transfer applicant infos.
	 *
	 * @return the number of quarry transfer applicant infos
	 */
	@Override
	public int getQuarryTransferApplicantInfosCount() {
		return _quarryTransferApplicantInfoLocalService.
			getQuarryTransferApplicantInfosCount();
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
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryTransferApplicantInfo
			updateQuarryTransferApplicantInfo(
				com.nbp.quary.application.form.service.model.
					QuarryTransferApplicantInfo quarryTransferApplicantInfo) {

		return _quarryTransferApplicantInfoLocalService.
			updateQuarryTransferApplicantInfo(quarryTransferApplicantInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _quarryTransferApplicantInfoLocalService.getBasePersistence();
	}

	@Override
	public QuarryTransferApplicantInfoLocalService getWrappedService() {
		return _quarryTransferApplicantInfoLocalService;
	}

	@Override
	public void setWrappedService(
		QuarryTransferApplicantInfoLocalService
			quarryTransferApplicantInfoLocalService) {

		_quarryTransferApplicantInfoLocalService =
			quarryTransferApplicantInfoLocalService;
	}

	private QuarryTransferApplicantInfoLocalService
		_quarryTransferApplicantInfoLocalService;

}