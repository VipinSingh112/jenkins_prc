/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativePermitLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativePermitLocalService
 * @generated
 */
public class CreativePermitLocalServiceWrapper
	implements CreativePermitLocalService,
			   ServiceWrapper<CreativePermitLocalService> {

	public CreativePermitLocalServiceWrapper() {
		this(null);
	}

	public CreativePermitLocalServiceWrapper(
		CreativePermitLocalService creativePermitLocalService) {

		_creativePermitLocalService = creativePermitLocalService;
	}

	/**
	 * Adds the creative permit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativePermit the creative permit
	 * @return the creative permit that was added
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativePermit
		addCreativePermit(
			com.nbp.creative.stages.services.model.CreativePermit
				creativePermit) {

		return _creativePermitLocalService.addCreativePermit(creativePermit);
	}

	/**
	 * Creates a new creative permit with the primary key. Does not add the creative permit to the database.
	 *
	 * @param creativePermitId the primary key for the new creative permit
	 * @return the new creative permit
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativePermit
		createCreativePermit(long creativePermitId) {

		return _creativePermitLocalService.createCreativePermit(
			creativePermitId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativePermitLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the creative permit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativePermit the creative permit
	 * @return the creative permit that was removed
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativePermit
		deleteCreativePermit(
			com.nbp.creative.stages.services.model.CreativePermit
				creativePermit) {

		return _creativePermitLocalService.deleteCreativePermit(creativePermit);
	}

	/**
	 * Deletes the creative permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativePermitId the primary key of the creative permit
	 * @return the creative permit that was removed
	 * @throws PortalException if a creative permit with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativePermit
			deleteCreativePermit(long creativePermitId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativePermitLocalService.deleteCreativePermit(
			creativePermitId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativePermitLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativePermitLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativePermitLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativePermitLocalService.dynamicQuery();
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

		return _creativePermitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativePermitModelImpl</code>.
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

		return _creativePermitLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativePermitModelImpl</code>.
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

		return _creativePermitLocalService.dynamicQuery(
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

		return _creativePermitLocalService.dynamicQueryCount(dynamicQuery);
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

		return _creativePermitLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.creative.stages.services.model.CreativePermit
		fetchCreativePermit(long creativePermitId) {

		return _creativePermitLocalService.fetchCreativePermit(
			creativePermitId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativePermitLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the creative permit with the primary key.
	 *
	 * @param creativePermitId the primary key of the creative permit
	 * @return the creative permit
	 * @throws PortalException if a creative permit with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativePermit
			getCreativePermit(long creativePermitId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativePermitLocalService.getCreativePermit(creativePermitId);
	}

	@Override
	public com.nbp.creative.stages.services.model.CreativePermit
			getCreativePermitBy_CI(String caseId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativePermitException {

		return _creativePermitLocalService.getCreativePermitBy_CI(caseId);
	}

	/**
	 * Returns a range of all the creative permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative permits
	 * @param end the upper bound of the range of creative permits (not inclusive)
	 * @return the range of creative permits
	 */
	@Override
	public java.util.List<com.nbp.creative.stages.services.model.CreativePermit>
		getCreativePermits(int start, int end) {

		return _creativePermitLocalService.getCreativePermits(start, end);
	}

	/**
	 * Returns the number of creative permits.
	 *
	 * @return the number of creative permits
	 */
	@Override
	public int getCreativePermitsCount() {
		return _creativePermitLocalService.getCreativePermitsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativePermitLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativePermitLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativePermitLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.creative.stages.services.model.CreativePermit
		updateAgriculturePermit(
			String caseId, String PIRPermtNumber, java.util.Date dateofIssue,
			java.util.Date dateofExpiration, String durationofPermit) {

		return _creativePermitLocalService.updateAgriculturePermit(
			caseId, PIRPermtNumber, dateofIssue, dateofExpiration,
			durationofPermit);
	}

	/**
	 * Updates the creative permit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativePermit the creative permit
	 * @return the creative permit that was updated
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativePermit
		updateCreativePermit(
			com.nbp.creative.stages.services.model.CreativePermit
				creativePermit) {

		return _creativePermitLocalService.updateCreativePermit(creativePermit);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativePermitLocalService.getBasePersistence();
	}

	@Override
	public CreativePermitLocalService getWrappedService() {
		return _creativePermitLocalService;
	}

	@Override
	public void setWrappedService(
		CreativePermitLocalService creativePermitLocalService) {

		_creativePermitLocalService = creativePermitLocalService;
	}

	private CreativePermitLocalService _creativePermitLocalService;

}