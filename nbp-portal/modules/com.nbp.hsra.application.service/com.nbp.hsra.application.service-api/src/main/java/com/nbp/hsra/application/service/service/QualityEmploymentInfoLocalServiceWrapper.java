/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QualityEmploymentInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualityEmploymentInfoLocalService
 * @generated
 */
public class QualityEmploymentInfoLocalServiceWrapper
	implements QualityEmploymentInfoLocalService,
			   ServiceWrapper<QualityEmploymentInfoLocalService> {

	public QualityEmploymentInfoLocalServiceWrapper() {
		this(null);
	}

	public QualityEmploymentInfoLocalServiceWrapper(
		QualityEmploymentInfoLocalService qualityEmploymentInfoLocalService) {

		_qualityEmploymentInfoLocalService = qualityEmploymentInfoLocalService;
	}

	/**
	 * Adds the quality employment info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityEmploymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityEmploymentInfo the quality employment info
	 * @return the quality employment info that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityEmploymentInfo
		addQualityEmploymentInfo(
			com.nbp.hsra.application.service.model.QualityEmploymentInfo
				qualityEmploymentInfo) {

		return _qualityEmploymentInfoLocalService.addQualityEmploymentInfo(
			qualityEmploymentInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityEmploymentInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quality employment info with the primary key. Does not add the quality employment info to the database.
	 *
	 * @param qualityEmploymentInfoId the primary key for the new quality employment info
	 * @return the new quality employment info
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityEmploymentInfo
		createQualityEmploymentInfo(long qualityEmploymentInfoId) {

		return _qualityEmploymentInfoLocalService.createQualityEmploymentInfo(
			qualityEmploymentInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityEmploymentInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quality employment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityEmploymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityEmploymentInfoId the primary key of the quality employment info
	 * @return the quality employment info that was removed
	 * @throws PortalException if a quality employment info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityEmploymentInfo
			deleteQualityEmploymentInfo(long qualityEmploymentInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityEmploymentInfoLocalService.deleteQualityEmploymentInfo(
			qualityEmploymentInfoId);
	}

	/**
	 * Deletes the quality employment info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityEmploymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityEmploymentInfo the quality employment info
	 * @return the quality employment info that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityEmploymentInfo
		deleteQualityEmploymentInfo(
			com.nbp.hsra.application.service.model.QualityEmploymentInfo
				qualityEmploymentInfo) {

		return _qualityEmploymentInfoLocalService.deleteQualityEmploymentInfo(
			qualityEmploymentInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _qualityEmploymentInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _qualityEmploymentInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qualityEmploymentInfoLocalService.dynamicQuery();
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

		return _qualityEmploymentInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualityEmploymentInfoModelImpl</code>.
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

		return _qualityEmploymentInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualityEmploymentInfoModelImpl</code>.
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

		return _qualityEmploymentInfoLocalService.dynamicQuery(
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

		return _qualityEmploymentInfoLocalService.dynamicQueryCount(
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

		return _qualityEmploymentInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.QualityEmploymentInfo
		fetchQualityEmploymentInfo(long qualityEmploymentInfoId) {

		return _qualityEmploymentInfoLocalService.fetchQualityEmploymentInfo(
			qualityEmploymentInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _qualityEmploymentInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.hsra.application.service.model.QualityEmploymentInfo
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityEmploymentInfoException {

		return _qualityEmploymentInfoLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _qualityEmploymentInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualityEmploymentInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityEmploymentInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the quality employment info with the primary key.
	 *
	 * @param qualityEmploymentInfoId the primary key of the quality employment info
	 * @return the quality employment info
	 * @throws PortalException if a quality employment info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityEmploymentInfo
			getQualityEmploymentInfo(long qualityEmploymentInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityEmploymentInfoLocalService.getQualityEmploymentInfo(
			qualityEmploymentInfoId);
	}

	/**
	 * Returns a range of all the quality employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualityEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality employment infos
	 * @param end the upper bound of the range of quality employment infos (not inclusive)
	 * @return the range of quality employment infos
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.QualityEmploymentInfo>
			getQualityEmploymentInfos(int start, int end) {

		return _qualityEmploymentInfoLocalService.getQualityEmploymentInfos(
			start, end);
	}

	/**
	 * Returns the number of quality employment infos.
	 *
	 * @return the number of quality employment infos
	 */
	@Override
	public int getQualityEmploymentInfosCount() {
		return _qualityEmploymentInfoLocalService.
			getQualityEmploymentInfosCount();
	}

	/**
	 * Updates the quality employment info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityEmploymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityEmploymentInfo the quality employment info
	 * @return the quality employment info that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityEmploymentInfo
		updateQualityEmploymentInfo(
			com.nbp.hsra.application.service.model.QualityEmploymentInfo
				qualityEmploymentInfo) {

		return _qualityEmploymentInfoLocalService.updateQualityEmploymentInfo(
			qualityEmploymentInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _qualityEmploymentInfoLocalService.getBasePersistence();
	}

	@Override
	public QualityEmploymentInfoLocalService getWrappedService() {
		return _qualityEmploymentInfoLocalService;
	}

	@Override
	public void setWrappedService(
		QualityEmploymentInfoLocalService qualityEmploymentInfoLocalService) {

		_qualityEmploymentInfoLocalService = qualityEmploymentInfoLocalService;
	}

	private QualityEmploymentInfoLocalService
		_qualityEmploymentInfoLocalService;

}