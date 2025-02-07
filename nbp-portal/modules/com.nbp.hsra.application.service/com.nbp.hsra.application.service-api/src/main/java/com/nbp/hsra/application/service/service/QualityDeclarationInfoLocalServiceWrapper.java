/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QualityDeclarationInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualityDeclarationInfoLocalService
 * @generated
 */
public class QualityDeclarationInfoLocalServiceWrapper
	implements QualityDeclarationInfoLocalService,
			   ServiceWrapper<QualityDeclarationInfoLocalService> {

	public QualityDeclarationInfoLocalServiceWrapper() {
		this(null);
	}

	public QualityDeclarationInfoLocalServiceWrapper(
		QualityDeclarationInfoLocalService qualityDeclarationInfoLocalService) {

		_qualityDeclarationInfoLocalService =
			qualityDeclarationInfoLocalService;
	}

	/**
	 * Adds the quality declaration info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityDeclarationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityDeclarationInfo the quality declaration info
	 * @return the quality declaration info that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityDeclarationInfo
		addQualityDeclarationInfo(
			com.nbp.hsra.application.service.model.QualityDeclarationInfo
				qualityDeclarationInfo) {

		return _qualityDeclarationInfoLocalService.addQualityDeclarationInfo(
			qualityDeclarationInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityDeclarationInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quality declaration info with the primary key. Does not add the quality declaration info to the database.
	 *
	 * @param qualityDeclarationInfoId the primary key for the new quality declaration info
	 * @return the new quality declaration info
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityDeclarationInfo
		createQualityDeclarationInfo(long qualityDeclarationInfoId) {

		return _qualityDeclarationInfoLocalService.createQualityDeclarationInfo(
			qualityDeclarationInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityDeclarationInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quality declaration info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityDeclarationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityDeclarationInfoId the primary key of the quality declaration info
	 * @return the quality declaration info that was removed
	 * @throws PortalException if a quality declaration info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityDeclarationInfo
			deleteQualityDeclarationInfo(long qualityDeclarationInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityDeclarationInfoLocalService.deleteQualityDeclarationInfo(
			qualityDeclarationInfoId);
	}

	/**
	 * Deletes the quality declaration info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityDeclarationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityDeclarationInfo the quality declaration info
	 * @return the quality declaration info that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityDeclarationInfo
		deleteQualityDeclarationInfo(
			com.nbp.hsra.application.service.model.QualityDeclarationInfo
				qualityDeclarationInfo) {

		return _qualityDeclarationInfoLocalService.deleteQualityDeclarationInfo(
			qualityDeclarationInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _qualityDeclarationInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _qualityDeclarationInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qualityDeclarationInfoLocalService.dynamicQuery();
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

		return _qualityDeclarationInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualityDeclarationInfoModelImpl</code>.
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

		return _qualityDeclarationInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualityDeclarationInfoModelImpl</code>.
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

		return _qualityDeclarationInfoLocalService.dynamicQuery(
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

		return _qualityDeclarationInfoLocalService.dynamicQueryCount(
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

		return _qualityDeclarationInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.QualityDeclarationInfo
		fetchQualityDeclarationInfo(long qualityDeclarationInfoId) {

		return _qualityDeclarationInfoLocalService.fetchQualityDeclarationInfo(
			qualityDeclarationInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _qualityDeclarationInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.hsra.application.service.model.QualityDeclarationInfo
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityDeclarationInfoException {

		return _qualityDeclarationInfoLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _qualityDeclarationInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualityDeclarationInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityDeclarationInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the quality declaration info with the primary key.
	 *
	 * @param qualityDeclarationInfoId the primary key of the quality declaration info
	 * @return the quality declaration info
	 * @throws PortalException if a quality declaration info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityDeclarationInfo
			getQualityDeclarationInfo(long qualityDeclarationInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualityDeclarationInfoLocalService.getQualityDeclarationInfo(
			qualityDeclarationInfoId);
	}

	/**
	 * Returns a range of all the quality declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualityDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality declaration infos
	 * @param end the upper bound of the range of quality declaration infos (not inclusive)
	 * @return the range of quality declaration infos
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.QualityDeclarationInfo>
			getQualityDeclarationInfos(int start, int end) {

		return _qualityDeclarationInfoLocalService.getQualityDeclarationInfos(
			start, end);
	}

	/**
	 * Returns the number of quality declaration infos.
	 *
	 * @return the number of quality declaration infos
	 */
	@Override
	public int getQualityDeclarationInfosCount() {
		return _qualityDeclarationInfoLocalService.
			getQualityDeclarationInfosCount();
	}

	/**
	 * Updates the quality declaration info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualityDeclarationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualityDeclarationInfo the quality declaration info
	 * @return the quality declaration info that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualityDeclarationInfo
		updateQualityDeclarationInfo(
			com.nbp.hsra.application.service.model.QualityDeclarationInfo
				qualityDeclarationInfo) {

		return _qualityDeclarationInfoLocalService.updateQualityDeclarationInfo(
			qualityDeclarationInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _qualityDeclarationInfoLocalService.getBasePersistence();
	}

	@Override
	public QualityDeclarationInfoLocalService getWrappedService() {
		return _qualityDeclarationInfoLocalService;
	}

	@Override
	public void setWrappedService(
		QualityDeclarationInfoLocalService qualityDeclarationInfoLocalService) {

		_qualityDeclarationInfoLocalService =
			qualityDeclarationInfoLocalService;
	}

	private QualityDeclarationInfoLocalService
		_qualityDeclarationInfoLocalService;

}