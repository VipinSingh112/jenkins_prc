/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ManufacturingRecommendationToJCALocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingRecommendationToJCALocalService
 * @generated
 */
public class ManufacturingRecommendationToJCALocalServiceWrapper
	implements ManufacturingRecommendationToJCALocalService,
			   ServiceWrapper<ManufacturingRecommendationToJCALocalService> {

	public ManufacturingRecommendationToJCALocalServiceWrapper() {
		this(null);
	}

	public ManufacturingRecommendationToJCALocalServiceWrapper(
		ManufacturingRecommendationToJCALocalService
			manufacturingRecommendationToJCALocalService) {

		_manufacturingRecommendationToJCALocalService =
			manufacturingRecommendationToJCALocalService;
	}

	/**
	 * Adds the manufacturing recommendation to jca to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingRecommendationToJCALocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingRecommendationToJCA the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca that was added
	 */
	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingRecommendationToJCA addManufacturingRecommendationToJCA(
			com.nbp.manufacturing.application.stages.services.model.
				ManufacturingRecommendationToJCA
					manufacturingRecommendationToJCA) {

		return _manufacturingRecommendationToJCALocalService.
			addManufacturingRecommendationToJCA(
				manufacturingRecommendationToJCA);
	}

	/**
	 * Creates a new manufacturing recommendation to jca with the primary key. Does not add the manufacturing recommendation to jca to the database.
	 *
	 * @param manufacturingJCAId the primary key for the new manufacturing recommendation to jca
	 * @return the new manufacturing recommendation to jca
	 */
	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingRecommendationToJCA createManufacturingRecommendationToJCA(
			long manufacturingJCAId) {

		return _manufacturingRecommendationToJCALocalService.
			createManufacturingRecommendationToJCA(manufacturingJCAId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingRecommendationToJCALocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the manufacturing recommendation to jca with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingRecommendationToJCALocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingJCAId the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca that was removed
	 * @throws PortalException if a manufacturing recommendation to jca with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingRecommendationToJCA deleteManufacturingRecommendationToJCA(
				long manufacturingJCAId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingRecommendationToJCALocalService.
			deleteManufacturingRecommendationToJCA(manufacturingJCAId);
	}

	/**
	 * Deletes the manufacturing recommendation to jca from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingRecommendationToJCALocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingRecommendationToJCA the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca that was removed
	 */
	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingRecommendationToJCA deleteManufacturingRecommendationToJCA(
			com.nbp.manufacturing.application.stages.services.model.
				ManufacturingRecommendationToJCA
					manufacturingRecommendationToJCA) {

		return _manufacturingRecommendationToJCALocalService.
			deleteManufacturingRecommendationToJCA(
				manufacturingRecommendationToJCA);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingRecommendationToJCALocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manufacturingRecommendationToJCALocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manufacturingRecommendationToJCALocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manufacturingRecommendationToJCALocalService.dynamicQuery();
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

		return _manufacturingRecommendationToJCALocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingRecommendationToJCAModelImpl</code>.
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

		return _manufacturingRecommendationToJCALocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingRecommendationToJCAModelImpl</code>.
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

		return _manufacturingRecommendationToJCALocalService.dynamicQuery(
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

		return _manufacturingRecommendationToJCALocalService.dynamicQueryCount(
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

		return _manufacturingRecommendationToJCALocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingRecommendationToJCA fetchManufacturingRecommendationToJCA(
			long manufacturingJCAId) {

		return _manufacturingRecommendationToJCALocalService.
			fetchManufacturingRecommendationToJCA(manufacturingJCAId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manufacturingRecommendationToJCALocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manufacturingRecommendationToJCALocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the manufacturing recommendation to jca with the primary key.
	 *
	 * @param manufacturingJCAId the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca
	 * @throws PortalException if a manufacturing recommendation to jca with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingRecommendationToJCA getManufacturingRecommendationToJCA(
				long manufacturingJCAId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingRecommendationToJCALocalService.
			getManufacturingRecommendationToJCA(manufacturingJCAId);
	}

	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingRecommendationToJCA getManufacturingRecommendationToJCA(
				String caseId)
			throws com.nbp.manufacturing.application.stages.services.exception.
				NoSuchManufacturingRecommendationToJCAException {

		return _manufacturingRecommendationToJCALocalService.
			getManufacturingRecommendationToJCA(caseId);
	}

	/**
	 * Returns a range of all the manufacturing recommendation to jcas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingRecommendationToJCAModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing recommendation to jcas
	 * @param end the upper bound of the range of manufacturing recommendation to jcas (not inclusive)
	 * @return the range of manufacturing recommendation to jcas
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.
			ManufacturingRecommendationToJCA>
				getManufacturingRecommendationToJCAs(int start, int end) {

		return _manufacturingRecommendationToJCALocalService.
			getManufacturingRecommendationToJCAs(start, end);
	}

	/**
	 * Returns the number of manufacturing recommendation to jcas.
	 *
	 * @return the number of manufacturing recommendation to jcas
	 */
	@Override
	public int getManufacturingRecommendationToJCAsCount() {
		return _manufacturingRecommendationToJCALocalService.
			getManufacturingRecommendationToJCAsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manufacturingRecommendationToJCALocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingRecommendationToJCALocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the manufacturing recommendation to jca in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingRecommendationToJCALocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingRecommendationToJCA the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca that was updated
	 */
	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingRecommendationToJCA updateManufacturingRecommendationToJCA(
			com.nbp.manufacturing.application.stages.services.model.
				ManufacturingRecommendationToJCA
					manufacturingRecommendationToJCA) {

		return _manufacturingRecommendationToJCALocalService.
			updateManufacturingRecommendationToJCA(
				manufacturingRecommendationToJCA);
	}

	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingRecommendationToJCA updateManufacturingRecommendationToJCA(
			String caseId, java.util.Date date, String recommendationToJCA,
			String recommendation, String numberOfMiicInspector) {

		return _manufacturingRecommendationToJCALocalService.
			updateManufacturingRecommendationToJCA(
				caseId, date, recommendationToJCA, recommendation,
				numberOfMiicInspector);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _manufacturingRecommendationToJCALocalService.
			getBasePersistence();
	}

	@Override
	public ManufacturingRecommendationToJCALocalService getWrappedService() {
		return _manufacturingRecommendationToJCALocalService;
	}

	@Override
	public void setWrappedService(
		ManufacturingRecommendationToJCALocalService
			manufacturingRecommendationToJCALocalService) {

		_manufacturingRecommendationToJCALocalService =
			manufacturingRecommendationToJCALocalService;
	}

	private ManufacturingRecommendationToJCALocalService
		_manufacturingRecommendationToJCALocalService;

}