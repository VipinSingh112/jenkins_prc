/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QualityProficiencyDetailLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualityProficiencyDetailLocalService
 * @generated
 */
public class QualityProficiencyDetailLocalServiceWrapper
	implements QualityProficiencyDetailLocalService,
			   ServiceWrapper<QualityProficiencyDetailLocalService> {

	public QualityProficiencyDetailLocalServiceWrapper() {
		this(null);
	}

	public QualityProficiencyDetailLocalServiceWrapper(
		QualityProficiencyDetailLocalService
			qualityProficiencyDetailLocalService) {

		_qualityProficiencyDetailLocalService =
			qualityProficiencyDetailLocalService;
	}

	/**
	 * Adds the quality proficiency detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityProficiencyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityProficiencyDetail the quality proficiency detail
	 * @return the quality proficiency detail that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityProficiencyDetail
		addQualityProficiencyDetail(
			com.nbp.hsra.application.service.model.QualityProficiencyDetail
				qualityProficiencyDetail) {

		return _qualityProficiencyDetailLocalService.
			addQualityProficiencyDetail(qualityProficiencyDetail);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityProficiencyDetailLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quality proficiency detail with the primary key. Does not add the quality proficiency detail to the database.
	 *
	 * @param qualityProficiDetailId the primary key for the new quality proficiency detail
	 * @return the new quality proficiency detail
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityProficiencyDetail
		createQualityProficiencyDetail(long qualityProficiDetailId) {

		return _qualityProficiencyDetailLocalService.
			createQualityProficiencyDetail(qualityProficiDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityProficiencyDetailLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quality proficiency detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityProficiencyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityProficiDetailId the primary key of the quality proficiency detail
	 * @return the quality proficiency detail that was removed
	 * @throws PortalException if a quality proficiency detail with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityProficiencyDetail
			deleteQualityProficiencyDetail(long qualityProficiDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityProficiencyDetailLocalService.
			deleteQualityProficiencyDetail(qualityProficiDetailId);
	}

	/**
	 * Deletes the quality proficiency detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityProficiencyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityProficiencyDetail the quality proficiency detail
	 * @return the quality proficiency detail that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityProficiencyDetail
		deleteQualityProficiencyDetail(
			com.nbp.hsra.application.service.model.QualityProficiencyDetail
				qualityProficiencyDetail) {

		return _qualityProficiencyDetailLocalService.
			deleteQualityProficiencyDetail(qualityProficiencyDetail);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _qualityProficiencyDetailLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _qualityProficiencyDetailLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qualityProficiencyDetailLocalService.dynamicQuery();
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

		return _qualityProficiencyDetailLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualityProficiencyDetailModelImpl</code>.
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

		return _qualityProficiencyDetailLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualityProficiencyDetailModelImpl</code>.
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

		return _qualityProficiencyDetailLocalService.dynamicQuery(
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

		return _qualityProficiencyDetailLocalService.dynamicQueryCount(
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

		return _qualityProficiencyDetailLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.QualityProficiencyDetail
		fetchQualityProficiencyDetail(long qualityProficiDetailId) {

		return _qualityProficiencyDetailLocalService.
			fetchQualityProficiencyDetail(qualityProficiDetailId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _qualityProficiencyDetailLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.hsra.application.service.model.QualityProficiencyDetail
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityProficiencyDetailException {

		return _qualityProficiencyDetailLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _qualityProficiencyDetailLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualityProficiencyDetailLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityProficiencyDetailLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the quality proficiency detail with the primary key.
	 *
	 * @param qualityProficiDetailId the primary key of the quality proficiency detail
	 * @return the quality proficiency detail
	 * @throws PortalException if a quality proficiency detail with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityProficiencyDetail
			getQualityProficiencyDetail(long qualityProficiDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityProficiencyDetailLocalService.
			getQualityProficiencyDetail(qualityProficiDetailId);
	}

	/**
	 * Returns a range of all the quality proficiency details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualityProficiencyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality proficiency details
	 * @param end the upper bound of the range of quality proficiency details (not inclusive)
	 * @return the range of quality proficiency details
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.QualityProficiencyDetail>
			getQualityProficiencyDetails(int start, int end) {

		return _qualityProficiencyDetailLocalService.
			getQualityProficiencyDetails(start, end);
	}

	/**
	 * Returns the number of quality proficiency details.
	 *
	 * @return the number of quality proficiency details
	 */
	@Override
	public int getQualityProficiencyDetailsCount() {
		return _qualityProficiencyDetailLocalService.
			getQualityProficiencyDetailsCount();
	}

	/**
	 * Updates the quality proficiency detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityProficiencyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityProficiencyDetail the quality proficiency detail
	 * @return the quality proficiency detail that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityProficiencyDetail
		updateQualityProficiencyDetail(
			com.nbp.hsra.application.service.model.QualityProficiencyDetail
				qualityProficiencyDetail) {

		return _qualityProficiencyDetailLocalService.
			updateQualityProficiencyDetail(qualityProficiencyDetail);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _qualityProficiencyDetailLocalService.getBasePersistence();
	}

	@Override
	public QualityProficiencyDetailLocalService getWrappedService() {
		return _qualityProficiencyDetailLocalService;
	}

	@Override
	public void setWrappedService(
		QualityProficiencyDetailLocalService
			qualityProficiencyDetailLocalService) {

		_qualityProficiencyDetailLocalService =
			qualityProficiencyDetailLocalService;
	}

	private QualityProficiencyDetailLocalService
		_qualityProficiencyDetailLocalService;

}