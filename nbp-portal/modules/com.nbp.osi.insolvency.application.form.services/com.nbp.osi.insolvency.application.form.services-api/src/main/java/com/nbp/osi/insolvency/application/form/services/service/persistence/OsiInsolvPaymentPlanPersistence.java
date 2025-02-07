/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiInsolvPaymentPlanException;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvPaymentPlan;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi insolv payment plan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvPaymentPlanUtil
 * @generated
 */
@ProviderType
public interface OsiInsolvPaymentPlanPersistence
	extends BasePersistence<OsiInsolvPaymentPlan> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiInsolvPaymentPlanUtil} to access the osi insolv payment plan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi insolv payment plan where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvPaymentPlanException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolv payment plan
	 * @throws NoSuchOsiInsolvPaymentPlanException if a matching osi insolv payment plan could not be found
	 */
	public OsiInsolvPaymentPlan findBygetOsiInsolvPaymentById(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvPaymentPlanException;

	/**
	 * Returns the osi insolv payment plan where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolv payment plan, or <code>null</code> if a matching osi insolv payment plan could not be found
	 */
	public OsiInsolvPaymentPlan fetchBygetOsiInsolvPaymentById(
		long osiInsolvencyId);

	/**
	 * Returns the osi insolv payment plan where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolv payment plan, or <code>null</code> if a matching osi insolv payment plan could not be found
	 */
	public OsiInsolvPaymentPlan fetchBygetOsiInsolvPaymentById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the osi insolv payment plan where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolv payment plan that was removed
	 */
	public OsiInsolvPaymentPlan removeBygetOsiInsolvPaymentById(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvPaymentPlanException;

	/**
	 * Returns the number of osi insolv payment plans where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolv payment plans
	 */
	public int countBygetOsiInsolvPaymentById(long osiInsolvencyId);

	/**
	 * Caches the osi insolv payment plan in the entity cache if it is enabled.
	 *
	 * @param osiInsolvPaymentPlan the osi insolv payment plan
	 */
	public void cacheResult(OsiInsolvPaymentPlan osiInsolvPaymentPlan);

	/**
	 * Caches the osi insolv payment plans in the entity cache if it is enabled.
	 *
	 * @param osiInsolvPaymentPlans the osi insolv payment plans
	 */
	public void cacheResult(
		java.util.List<OsiInsolvPaymentPlan> osiInsolvPaymentPlans);

	/**
	 * Creates a new osi insolv payment plan with the primary key. Does not add the osi insolv payment plan to the database.
	 *
	 * @param osiInsolvPaymentPlanId the primary key for the new osi insolv payment plan
	 * @return the new osi insolv payment plan
	 */
	public OsiInsolvPaymentPlan create(long osiInsolvPaymentPlanId);

	/**
	 * Removes the osi insolv payment plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolvPaymentPlanId the primary key of the osi insolv payment plan
	 * @return the osi insolv payment plan that was removed
	 * @throws NoSuchOsiInsolvPaymentPlanException if a osi insolv payment plan with the primary key could not be found
	 */
	public OsiInsolvPaymentPlan remove(long osiInsolvPaymentPlanId)
		throws NoSuchOsiInsolvPaymentPlanException;

	public OsiInsolvPaymentPlan updateImpl(
		OsiInsolvPaymentPlan osiInsolvPaymentPlan);

	/**
	 * Returns the osi insolv payment plan with the primary key or throws a <code>NoSuchOsiInsolvPaymentPlanException</code> if it could not be found.
	 *
	 * @param osiInsolvPaymentPlanId the primary key of the osi insolv payment plan
	 * @return the osi insolv payment plan
	 * @throws NoSuchOsiInsolvPaymentPlanException if a osi insolv payment plan with the primary key could not be found
	 */
	public OsiInsolvPaymentPlan findByPrimaryKey(long osiInsolvPaymentPlanId)
		throws NoSuchOsiInsolvPaymentPlanException;

	/**
	 * Returns the osi insolv payment plan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolvPaymentPlanId the primary key of the osi insolv payment plan
	 * @return the osi insolv payment plan, or <code>null</code> if a osi insolv payment plan with the primary key could not be found
	 */
	public OsiInsolvPaymentPlan fetchByPrimaryKey(long osiInsolvPaymentPlanId);

	/**
	 * Returns all the osi insolv payment plans.
	 *
	 * @return the osi insolv payment plans
	 */
	public java.util.List<OsiInsolvPaymentPlan> findAll();

	/**
	 * Returns a range of all the osi insolv payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvPaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolv payment plans
	 * @param end the upper bound of the range of osi insolv payment plans (not inclusive)
	 * @return the range of osi insolv payment plans
	 */
	public java.util.List<OsiInsolvPaymentPlan> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi insolv payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvPaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolv payment plans
	 * @param end the upper bound of the range of osi insolv payment plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolv payment plans
	 */
	public java.util.List<OsiInsolvPaymentPlan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInsolvPaymentPlan>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolv payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvPaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolv payment plans
	 * @param end the upper bound of the range of osi insolv payment plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolv payment plans
	 */
	public java.util.List<OsiInsolvPaymentPlan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInsolvPaymentPlan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi insolv payment plans from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi insolv payment plans.
	 *
	 * @return the number of osi insolv payment plans
	 */
	public int countAll();

}