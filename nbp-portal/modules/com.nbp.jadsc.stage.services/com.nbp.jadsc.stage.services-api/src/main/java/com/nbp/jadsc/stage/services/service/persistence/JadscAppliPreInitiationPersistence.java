/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jadsc.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.stage.services.exception.NoSuchJadscAppliPreInitiationException;
import com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc appli pre initiation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliPreInitiationUtil
 * @generated
 */
@ProviderType
public interface JadscAppliPreInitiationPersistence
	extends BasePersistence<JadscAppliPreInitiation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JadscAppliPreInitiationUtil} to access the jadsc appli pre initiation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the jadsc appli pre initiation where caseId = &#63; or throws a <code>NoSuchJadscAppliPreInitiationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a matching jadsc appli pre initiation could not be found
	 */
	public JadscAppliPreInitiation findBygetJadsc_PI_CI(String caseId)
		throws NoSuchJadscAppliPreInitiationException;

	/**
	 * Returns the jadsc appli pre initiation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli pre initiation, or <code>null</code> if a matching jadsc appli pre initiation could not be found
	 */
	public JadscAppliPreInitiation fetchBygetJadsc_PI_CI(String caseId);

	/**
	 * Returns the jadsc appli pre initiation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc appli pre initiation, or <code>null</code> if a matching jadsc appli pre initiation could not be found
	 */
	public JadscAppliPreInitiation fetchBygetJadsc_PI_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the jadsc appli pre initiation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc appli pre initiation that was removed
	 */
	public JadscAppliPreInitiation removeBygetJadsc_PI_CI(String caseId)
		throws NoSuchJadscAppliPreInitiationException;

	/**
	 * Returns the number of jadsc appli pre initiations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc appli pre initiations
	 */
	public int countBygetJadsc_PI_CI(String caseId);

	/**
	 * Returns all the jadsc appli pre initiations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the matching jadsc appli pre initiations
	 */
	public java.util.List<JadscAppliPreInitiation> findBygetJadsc_By_PI(
		String outcome);

	/**
	 * Returns a range of all the jadsc appli pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @return the range of matching jadsc appli pre initiations
	 */
	public java.util.List<JadscAppliPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc appli pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc appli pre initiations
	 */
	public java.util.List<JadscAppliPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliPreInitiation> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc appli pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc appli pre initiations
	 */
	public java.util.List<JadscAppliPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliPreInitiation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a matching jadsc appli pre initiation could not be found
	 */
	public JadscAppliPreInitiation findBygetJadsc_By_PI_First(
			String outcome,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscAppliPreInitiation> orderByComparator)
		throws NoSuchJadscAppliPreInitiationException;

	/**
	 * Returns the first jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli pre initiation, or <code>null</code> if a matching jadsc appli pre initiation could not be found
	 */
	public JadscAppliPreInitiation fetchBygetJadsc_By_PI_First(
		String outcome,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliPreInitiation> orderByComparator);

	/**
	 * Returns the last jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a matching jadsc appli pre initiation could not be found
	 */
	public JadscAppliPreInitiation findBygetJadsc_By_PI_Last(
			String outcome,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscAppliPreInitiation> orderByComparator)
		throws NoSuchJadscAppliPreInitiationException;

	/**
	 * Returns the last jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli pre initiation, or <code>null</code> if a matching jadsc appli pre initiation could not be found
	 */
	public JadscAppliPreInitiation fetchBygetJadsc_By_PI_Last(
		String outcome,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliPreInitiation> orderByComparator);

	/**
	 * Returns the jadsc appli pre initiations before and after the current jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the current jadsc appli pre initiation
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a jadsc appli pre initiation with the primary key could not be found
	 */
	public JadscAppliPreInitiation[] findBygetJadsc_By_PI_PrevAndNext(
			long jadscAppliPreInitiationId, String outcome,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscAppliPreInitiation> orderByComparator)
		throws NoSuchJadscAppliPreInitiationException;

	/**
	 * Removes all the jadsc appli pre initiations where outcome = &#63; from the database.
	 *
	 * @param outcome the outcome
	 */
	public void removeBygetJadsc_By_PI(String outcome);

	/**
	 * Returns the number of jadsc appli pre initiations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the number of matching jadsc appli pre initiations
	 */
	public int countBygetJadsc_By_PI(String outcome);

	/**
	 * Caches the jadsc appli pre initiation in the entity cache if it is enabled.
	 *
	 * @param jadscAppliPreInitiation the jadsc appli pre initiation
	 */
	public void cacheResult(JadscAppliPreInitiation jadscAppliPreInitiation);

	/**
	 * Caches the jadsc appli pre initiations in the entity cache if it is enabled.
	 *
	 * @param jadscAppliPreInitiations the jadsc appli pre initiations
	 */
	public void cacheResult(
		java.util.List<JadscAppliPreInitiation> jadscAppliPreInitiations);

	/**
	 * Creates a new jadsc appli pre initiation with the primary key. Does not add the jadsc appli pre initiation to the database.
	 *
	 * @param jadscAppliPreInitiationId the primary key for the new jadsc appli pre initiation
	 * @return the new jadsc appli pre initiation
	 */
	public JadscAppliPreInitiation create(long jadscAppliPreInitiationId);

	/**
	 * Removes the jadsc appli pre initiation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation that was removed
	 * @throws NoSuchJadscAppliPreInitiationException if a jadsc appli pre initiation with the primary key could not be found
	 */
	public JadscAppliPreInitiation remove(long jadscAppliPreInitiationId)
		throws NoSuchJadscAppliPreInitiationException;

	public JadscAppliPreInitiation updateImpl(
		JadscAppliPreInitiation jadscAppliPreInitiation);

	/**
	 * Returns the jadsc appli pre initiation with the primary key or throws a <code>NoSuchJadscAppliPreInitiationException</code> if it could not be found.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a jadsc appli pre initiation with the primary key could not be found
	 */
	public JadscAppliPreInitiation findByPrimaryKey(
			long jadscAppliPreInitiationId)
		throws NoSuchJadscAppliPreInitiationException;

	/**
	 * Returns the jadsc appli pre initiation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation, or <code>null</code> if a jadsc appli pre initiation with the primary key could not be found
	 */
	public JadscAppliPreInitiation fetchByPrimaryKey(
		long jadscAppliPreInitiationId);

	/**
	 * Returns all the jadsc appli pre initiations.
	 *
	 * @return the jadsc appli pre initiations
	 */
	public java.util.List<JadscAppliPreInitiation> findAll();

	/**
	 * Returns a range of all the jadsc appli pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @return the range of jadsc appli pre initiations
	 */
	public java.util.List<JadscAppliPreInitiation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jadsc appli pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc appli pre initiations
	 */
	public java.util.List<JadscAppliPreInitiation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliPreInitiation> orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc appli pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc appli pre initiations
	 */
	public java.util.List<JadscAppliPreInitiation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JadscAppliPreInitiation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc appli pre initiations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc appli pre initiations.
	 *
	 * @return the number of jadsc appli pre initiations
	 */
	public int countAll();

}