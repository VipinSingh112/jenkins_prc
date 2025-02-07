/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.stage.services.exception.NoSuchFactoriesCerticateOfRegisException;
import com.nbp.factories.registration.stage.services.model.FactoriesCerticateOfRegis;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for FactoriesCerticateOfRegis. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesCerticateOfRegisLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface FactoriesCerticateOfRegisLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.factories.registration.stage.services.service.impl.FactoriesCerticateOfRegisLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the factories certicate of regis local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link FactoriesCerticateOfRegisLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the factories certicate of regis to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesCerticateOfRegisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesCerticateOfRegis the factories certicate of regis
	 * @return the factories certicate of regis that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public FactoriesCerticateOfRegis addFactoriesCerticateOfRegis(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis);

	/**
	 * Creates a new factories certicate of regis with the primary key. Does not add the factories certicate of regis to the database.
	 *
	 * @param factoriesCerticateOfRegisId the primary key for the new factories certicate of regis
	 * @return the new factories certicate of regis
	 */
	@Transactional(enabled = false)
	public FactoriesCerticateOfRegis createFactoriesCerticateOfRegis(
		long factoriesCerticateOfRegisId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the factories certicate of regis from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesCerticateOfRegisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesCerticateOfRegis the factories certicate of regis
	 * @return the factories certicate of regis that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public FactoriesCerticateOfRegis deleteFactoriesCerticateOfRegis(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis);

	/**
	 * Deletes the factories certicate of regis with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesCerticateOfRegisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the factories certicate of regis
	 * @return the factories certicate of regis that was removed
	 * @throws PortalException if a factories certicate of regis with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public FactoriesCerticateOfRegis deleteFactoriesCerticateOfRegis(
			long factoriesCerticateOfRegisId)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> T dslQuery(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int dslQueryCount(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FactoriesCerticateOfRegis fetchFactoriesCerticateOfRegis(
		long factoriesCerticateOfRegisId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * Returns the factories certicate of regis with the primary key.
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the factories certicate of regis
	 * @return the factories certicate of regis
	 * @throws PortalException if a factories certicate of regis with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FactoriesCerticateOfRegis getFactoriesCerticateOfRegis(
			long factoriesCerticateOfRegisId)
		throws PortalException;

	/**
	 * Returns a range of all the factories certicate of regises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @return the range of factories certicate of regises
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FactoriesCerticateOfRegis> getFactoriesCerticateOfRegises(
		int start, int end);

	/**
	 * Returns the number of factories certicate of regises.
	 *
	 * @return the number of factories certicate of regises
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFactoriesCerticateOfRegisesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FactoriesCerticateOfRegis getFactoryCertifiResgiBy_CI(String caseId)
		throws NoSuchFactoriesCerticateOfRegisException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FactoriesCerticateOfRegis> getFactoryCertifiResgisBy_CI(
		String caseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the factories certicate of regis in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesCerticateOfRegisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesCerticateOfRegis the factories certicate of regis
	 * @return the factories certicate of regis that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public FactoriesCerticateOfRegis updateFactoriesCerticateOfRegis(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis);

	public FactoriesCerticateOfRegis updateFactoriesCertificateOfRegistration(
		String caseId, String nameOfEstablishment, String parish,
		String procuctCatAndName, Date certificateIssueDate,
		Date dateOfExpiration, String registration, String status);

}