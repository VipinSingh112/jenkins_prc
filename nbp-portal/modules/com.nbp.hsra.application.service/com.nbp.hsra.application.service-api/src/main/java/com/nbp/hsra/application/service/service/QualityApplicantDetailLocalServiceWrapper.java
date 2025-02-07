/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QualityApplicantDetailLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualityApplicantDetailLocalService
 * @generated
 */
public class QualityApplicantDetailLocalServiceWrapper
	implements QualityApplicantDetailLocalService,
			   ServiceWrapper<QualityApplicantDetailLocalService> {

	public QualityApplicantDetailLocalServiceWrapper() {
		this(null);
	}

	public QualityApplicantDetailLocalServiceWrapper(
		QualityApplicantDetailLocalService qualityApplicantDetailLocalService) {

		_qualityApplicantDetailLocalService =
			qualityApplicantDetailLocalService;
	}

	/**
	 * Adds the quality applicant detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityApplicantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityApplicantDetail the quality applicant detail
	 * @return the quality applicant detail that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityApplicantDetail
		addQualityApplicantDetail(
			com.nbp.hsra.application.service.model.QualityApplicantDetail
				qualityApplicantDetail) {

		return _qualityApplicantDetailLocalService.addQualityApplicantDetail(
			qualityApplicantDetail);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityApplicantDetailLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quality applicant detail with the primary key. Does not add the quality applicant detail to the database.
	 *
	 * @param qualityApplicantDetailId the primary key for the new quality applicant detail
	 * @return the new quality applicant detail
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityApplicantDetail
		createQualityApplicantDetail(long qualityApplicantDetailId) {

		return _qualityApplicantDetailLocalService.createQualityApplicantDetail(
			qualityApplicantDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityApplicantDetailLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quality applicant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityApplicantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityApplicantDetailId the primary key of the quality applicant detail
	 * @return the quality applicant detail that was removed
	 * @throws PortalException if a quality applicant detail with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityApplicantDetail
			deleteQualityApplicantDetail(long qualityApplicantDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityApplicantDetailLocalService.deleteQualityApplicantDetail(
			qualityApplicantDetailId);
	}

	/**
	 * Deletes the quality applicant detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityApplicantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityApplicantDetail the quality applicant detail
	 * @return the quality applicant detail that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityApplicantDetail
		deleteQualityApplicantDetail(
			com.nbp.hsra.application.service.model.QualityApplicantDetail
				qualityApplicantDetail) {

		return _qualityApplicantDetailLocalService.deleteQualityApplicantDetail(
			qualityApplicantDetail);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _qualityApplicantDetailLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _qualityApplicantDetailLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qualityApplicantDetailLocalService.dynamicQuery();
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

		return _qualityApplicantDetailLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualityApplicantDetailModelImpl</code>.
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

		return _qualityApplicantDetailLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualityApplicantDetailModelImpl</code>.
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

		return _qualityApplicantDetailLocalService.dynamicQuery(
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

		return _qualityApplicantDetailLocalService.dynamicQueryCount(
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

		return _qualityApplicantDetailLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.QualityApplicantDetail
		fetchQualityApplicantDetail(long qualityApplicantDetailId) {

		return _qualityApplicantDetailLocalService.fetchQualityApplicantDetail(
			qualityApplicantDetailId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _qualityApplicantDetailLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.hsra.application.service.model.QualityApplicantDetail
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityApplicantDetailException {

		return _qualityApplicantDetailLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _qualityApplicantDetailLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualityApplicantDetailLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityApplicantDetailLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the quality applicant detail with the primary key.
	 *
	 * @param qualityApplicantDetailId the primary key of the quality applicant detail
	 * @return the quality applicant detail
	 * @throws PortalException if a quality applicant detail with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityApplicantDetail
			getQualityApplicantDetail(long qualityApplicantDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityApplicantDetailLocalService.getQualityApplicantDetail(
			qualityApplicantDetailId);
	}

	/**
	 * Returns a range of all the quality applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualityApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality applicant details
	 * @param end the upper bound of the range of quality applicant details (not inclusive)
	 * @return the range of quality applicant details
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.QualityApplicantDetail>
			getQualityApplicantDetails(int start, int end) {

		return _qualityApplicantDetailLocalService.getQualityApplicantDetails(
			start, end);
	}

	/**
	 * Returns the number of quality applicant details.
	 *
	 * @return the number of quality applicant details
	 */
	@Override
	public int getQualityApplicantDetailsCount() {
		return _qualityApplicantDetailLocalService.
			getQualityApplicantDetailsCount();
	}

	/**
	 * Updates the quality applicant detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityApplicantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityApplicantDetail the quality applicant detail
	 * @return the quality applicant detail that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityApplicantDetail
		updateQualityApplicantDetail(
			com.nbp.hsra.application.service.model.QualityApplicantDetail
				qualityApplicantDetail) {

		return _qualityApplicantDetailLocalService.updateQualityApplicantDetail(
			qualityApplicantDetail);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _qualityApplicantDetailLocalService.getBasePersistence();
	}

	@Override
	public QualityApplicantDetailLocalService getWrappedService() {
		return _qualityApplicantDetailLocalService;
	}

	@Override
	public void setWrappedService(
		QualityApplicantDetailLocalService qualityApplicantDetailLocalService) {

		_qualityApplicantDetailLocalService =
			qualityApplicantDetailLocalService;
	}

	private QualityApplicantDetailLocalService
		_qualityApplicantDetailLocalService;

}