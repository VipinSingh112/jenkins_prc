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

package com.nbp.pharmaceutical.stages.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaApplicationCommitteeDecisionException;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationCommitteeDecision;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationCommitteeDecisionTable;
import com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationCommitteeDecisionImpl;
import com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationCommitteeDecisionModelImpl;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationCommitteeDecisionPersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationCommitteeDecisionUtil;
import com.nbp.pharmaceutical.stages.services.service.persistence.impl.constants.PHARMA_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the pharma application committee decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {
		PharmaApplicationCommitteeDecisionPersistence.class,
		BasePersistence.class
	}
)
public class PharmaApplicationCommitteeDecisionPersistenceImpl
	extends BasePersistenceImpl<PharmaApplicationCommitteeDecision>
	implements PharmaApplicationCommitteeDecisionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaApplicationCommitteeDecisionUtil</code> to access the pharma application committee decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaApplicationCommitteeDecisionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetPharma_CD_CI;
	private FinderPath _finderPathCountBygetPharma_CD_CI;

	/**
	 * Returns the pharma application committee decision where caseId = &#63; or throws a <code>NoSuchPharmaApplicationCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a matching pharma application committee decision could not be found
	 */
	@Override
	public PharmaApplicationCommitteeDecision findBygetPharma_CD_CI(
			String caseId)
		throws NoSuchPharmaApplicationCommitteeDecisionException {

		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision =
			fetchBygetPharma_CD_CI(caseId);

		if (pharmaApplicationCommitteeDecision == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaApplicationCommitteeDecisionException(
				sb.toString());
		}

		return pharmaApplicationCommitteeDecision;
	}

	/**
	 * Returns the pharma application committee decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application committee decision, or <code>null</code> if a matching pharma application committee decision could not be found
	 */
	@Override
	public PharmaApplicationCommitteeDecision fetchBygetPharma_CD_CI(
		String caseId) {

		return fetchBygetPharma_CD_CI(caseId, true);
	}

	/**
	 * Returns the pharma application committee decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application committee decision, or <code>null</code> if a matching pharma application committee decision could not be found
	 */
	@Override
	public PharmaApplicationCommitteeDecision fetchBygetPharma_CD_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPharma_CD_CI, finderArgs,this);
		}

		if (result instanceof PharmaApplicationCommitteeDecision) {
			PharmaApplicationCommitteeDecision
				pharmaApplicationCommitteeDecision =
					(PharmaApplicationCommitteeDecision)result;

			if (!Objects.equals(
					caseId, pharmaApplicationCommitteeDecision.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONCOMMITTEEDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMA_CD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPHARMA_CD_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<PharmaApplicationCommitteeDecision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPharma_CD_CI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"PharmaApplicationCommitteeDecisionPersistenceImpl.fetchBygetPharma_CD_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaApplicationCommitteeDecision
						pharmaApplicationCommitteeDecision = list.get(0);

					result = pharmaApplicationCommitteeDecision;

					cacheResult(pharmaApplicationCommitteeDecision);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (PharmaApplicationCommitteeDecision)result;
		}
	}

	/**
	 * Removes the pharma application committee decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the pharma application committee decision that was removed
	 */
	@Override
	public PharmaApplicationCommitteeDecision removeBygetPharma_CD_CI(
			String caseId)
		throws NoSuchPharmaApplicationCommitteeDecisionException {

		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision =
			findBygetPharma_CD_CI(caseId);

		return remove(pharmaApplicationCommitteeDecision);
	}

	/**
	 * Returns the number of pharma application committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application committee decisions
	 */
	@Override
	public int countBygetPharma_CD_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPharma_CD_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONCOMMITTEEDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMA_CD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPHARMA_CD_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETPHARMA_CD_CI_CASEID_2 =
		"pharmaApplicationCommitteeDecision.caseId = ?";

	private static final String _FINDER_COLUMN_GETPHARMA_CD_CI_CASEID_3 =
		"(pharmaApplicationCommitteeDecision.caseId IS NULL OR pharmaApplicationCommitteeDecision.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetPharma_By_CD;
	private FinderPath _finderPathWithoutPaginationFindBygetPharma_By_CD;
	private FinderPath _finderPathCountBygetPharma_By_CD;

	/**
	 * Returns all the pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching pharma application committee decisions
	 */
	@Override
	public List<PharmaApplicationCommitteeDecision> findBygetPharma_By_CD(
		String committeeDecision) {

		return findBygetPharma_By_CD(
			committeeDecision, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @return the range of matching pharma application committee decisions
	 */
	@Override
	public List<PharmaApplicationCommitteeDecision> findBygetPharma_By_CD(
		String committeeDecision, int start, int end) {

		return findBygetPharma_By_CD(committeeDecision, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application committee decisions
	 */
	@Override
	public List<PharmaApplicationCommitteeDecision> findBygetPharma_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<PharmaApplicationCommitteeDecision>
			orderByComparator) {

		return findBygetPharma_By_CD(
			committeeDecision, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application committee decisions
	 */
	@Override
	public List<PharmaApplicationCommitteeDecision> findBygetPharma_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<PharmaApplicationCommitteeDecision> orderByComparator,
		boolean useFinderCache) {

		committeeDecision = Objects.toString(committeeDecision, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetPharma_By_CD;
				finderArgs = new Object[] {committeeDecision};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetPharma_By_CD;
			finderArgs = new Object[] {
				committeeDecision, start, end, orderByComparator
			};
		}

		List<PharmaApplicationCommitteeDecision> list = null;

		if (useFinderCache) {
			list =
				(List<PharmaApplicationCommitteeDecision>)finderCache.getResult(
					finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaApplicationCommitteeDecision
						pharmaApplicationCommitteeDecision : list) {

					if (!committeeDecision.equals(
							pharmaApplicationCommitteeDecision.
								getCommitteeDecision())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONCOMMITTEEDECISION_WHERE);

			boolean bindCommitteeDecision = false;

			if (committeeDecision.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMA_BY_CD_COMMITTEEDECISION_3);
			}
			else {
				bindCommitteeDecision = true;

				sb.append(_FINDER_COLUMN_GETPHARMA_BY_CD_COMMITTEEDECISION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					PharmaApplicationCommitteeDecisionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCommitteeDecision) {
					queryPos.add(committeeDecision);
				}

				list = (List<PharmaApplicationCommitteeDecision>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a matching pharma application committee decision could not be found
	 */
	@Override
	public PharmaApplicationCommitteeDecision findBygetPharma_By_CD_First(
			String committeeDecision,
			OrderByComparator<PharmaApplicationCommitteeDecision>
				orderByComparator)
		throws NoSuchPharmaApplicationCommitteeDecisionException {

		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision =
			fetchBygetPharma_By_CD_First(committeeDecision, orderByComparator);

		if (pharmaApplicationCommitteeDecision != null) {
			return pharmaApplicationCommitteeDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("committeeDecision=");
		sb.append(committeeDecision);

		sb.append("}");

		throw new NoSuchPharmaApplicationCommitteeDecisionException(
			sb.toString());
	}

	/**
	 * Returns the first pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application committee decision, or <code>null</code> if a matching pharma application committee decision could not be found
	 */
	@Override
	public PharmaApplicationCommitteeDecision fetchBygetPharma_By_CD_First(
		String committeeDecision,
		OrderByComparator<PharmaApplicationCommitteeDecision>
			orderByComparator) {

		List<PharmaApplicationCommitteeDecision> list = findBygetPharma_By_CD(
			committeeDecision, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a matching pharma application committee decision could not be found
	 */
	@Override
	public PharmaApplicationCommitteeDecision findBygetPharma_By_CD_Last(
			String committeeDecision,
			OrderByComparator<PharmaApplicationCommitteeDecision>
				orderByComparator)
		throws NoSuchPharmaApplicationCommitteeDecisionException {

		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision =
			fetchBygetPharma_By_CD_Last(committeeDecision, orderByComparator);

		if (pharmaApplicationCommitteeDecision != null) {
			return pharmaApplicationCommitteeDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("committeeDecision=");
		sb.append(committeeDecision);

		sb.append("}");

		throw new NoSuchPharmaApplicationCommitteeDecisionException(
			sb.toString());
	}

	/**
	 * Returns the last pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application committee decision, or <code>null</code> if a matching pharma application committee decision could not be found
	 */
	@Override
	public PharmaApplicationCommitteeDecision fetchBygetPharma_By_CD_Last(
		String committeeDecision,
		OrderByComparator<PharmaApplicationCommitteeDecision>
			orderByComparator) {

		int count = countBygetPharma_By_CD(committeeDecision);

		if (count == 0) {
			return null;
		}

		List<PharmaApplicationCommitteeDecision> list = findBygetPharma_By_CD(
			committeeDecision, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma application committee decisions before and after the current pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the current pharma application committee decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a pharma application committee decision with the primary key could not be found
	 */
	@Override
	public PharmaApplicationCommitteeDecision[]
			findBygetPharma_By_CD_PrevAndNext(
				long pharmaCommitteeDecisionId, String committeeDecision,
				OrderByComparator<PharmaApplicationCommitteeDecision>
					orderByComparator)
		throws NoSuchPharmaApplicationCommitteeDecisionException {

		committeeDecision = Objects.toString(committeeDecision, "");

		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision =
			findByPrimaryKey(pharmaCommitteeDecisionId);

		Session session = null;

		try {
			session = openSession();

			PharmaApplicationCommitteeDecision[] array =
				new PharmaApplicationCommitteeDecisionImpl[3];

			array[0] = getBygetPharma_By_CD_PrevAndNext(
				session, pharmaApplicationCommitteeDecision, committeeDecision,
				orderByComparator, true);

			array[1] = pharmaApplicationCommitteeDecision;

			array[2] = getBygetPharma_By_CD_PrevAndNext(
				session, pharmaApplicationCommitteeDecision, committeeDecision,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected PharmaApplicationCommitteeDecision
		getBygetPharma_By_CD_PrevAndNext(
			Session session,
			PharmaApplicationCommitteeDecision
				pharmaApplicationCommitteeDecision,
			String committeeDecision,
			OrderByComparator<PharmaApplicationCommitteeDecision>
				orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PHARMAAPPLICATIONCOMMITTEEDECISION_WHERE);

		boolean bindCommitteeDecision = false;

		if (committeeDecision.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPHARMA_BY_CD_COMMITTEEDECISION_3);
		}
		else {
			bindCommitteeDecision = true;

			sb.append(_FINDER_COLUMN_GETPHARMA_BY_CD_COMMITTEEDECISION_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(
				PharmaApplicationCommitteeDecisionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCommitteeDecision) {
			queryPos.add(committeeDecision);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						pharmaApplicationCommitteeDecision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaApplicationCommitteeDecision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma application committee decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	@Override
	public void removeBygetPharma_By_CD(String committeeDecision) {
		for (PharmaApplicationCommitteeDecision
				pharmaApplicationCommitteeDecision :
					findBygetPharma_By_CD(
						committeeDecision, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
						null)) {

			remove(pharmaApplicationCommitteeDecision);
		}
	}

	/**
	 * Returns the number of pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching pharma application committee decisions
	 */
	@Override
	public int countBygetPharma_By_CD(String committeeDecision) {
		committeeDecision = Objects.toString(committeeDecision, "");

		FinderPath finderPath = _finderPathCountBygetPharma_By_CD;

		Object[] finderArgs = new Object[] {committeeDecision};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONCOMMITTEEDECISION_WHERE);

			boolean bindCommitteeDecision = false;

			if (committeeDecision.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMA_BY_CD_COMMITTEEDECISION_3);
			}
			else {
				bindCommitteeDecision = true;

				sb.append(_FINDER_COLUMN_GETPHARMA_BY_CD_COMMITTEEDECISION_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCommitteeDecision) {
					queryPos.add(committeeDecision);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETPHARMA_BY_CD_COMMITTEEDECISION_2 =
			"pharmaApplicationCommitteeDecision.committeeDecision = ?";

	private static final String
		_FINDER_COLUMN_GETPHARMA_BY_CD_COMMITTEEDECISION_3 =
			"(pharmaApplicationCommitteeDecision.committeeDecision IS NULL OR pharmaApplicationCommitteeDecision.committeeDecision = '')";

	public PharmaApplicationCommitteeDecisionPersistenceImpl() {
		setModelClass(PharmaApplicationCommitteeDecision.class);

		setModelImplClass(PharmaApplicationCommitteeDecisionImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaApplicationCommitteeDecisionTable.INSTANCE);
	}

	/**
	 * Caches the pharma application committee decision in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationCommitteeDecision the pharma application committee decision
	 */
	@Override
	public void cacheResult(
		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision) {

		entityCache.putResult(
			PharmaApplicationCommitteeDecisionImpl.class,
			pharmaApplicationCommitteeDecision.getPrimaryKey(),
			pharmaApplicationCommitteeDecision);

		finderCache.putResult(
			_finderPathFetchBygetPharma_CD_CI,
			new Object[] {pharmaApplicationCommitteeDecision.getCaseId()},
			pharmaApplicationCommitteeDecision);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma application committee decisions in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationCommitteeDecisions the pharma application committee decisions
	 */
	@Override
	public void cacheResult(
		List<PharmaApplicationCommitteeDecision>
			pharmaApplicationCommitteeDecisions) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaApplicationCommitteeDecisions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaApplicationCommitteeDecision
				pharmaApplicationCommitteeDecision :
					pharmaApplicationCommitteeDecisions) {

			if (entityCache.getResult(
					PharmaApplicationCommitteeDecisionImpl.class,
					pharmaApplicationCommitteeDecision.getPrimaryKey()) ==
						null) {

				cacheResult(pharmaApplicationCommitteeDecision);
			}
		}
	}

	/**
	 * Clears the cache for all pharma application committee decisions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaApplicationCommitteeDecisionImpl.class);

		finderCache.clearCache(PharmaApplicationCommitteeDecisionImpl.class);
	}

	/**
	 * Clears the cache for the pharma application committee decision.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision) {

		entityCache.removeResult(
			PharmaApplicationCommitteeDecisionImpl.class,
			pharmaApplicationCommitteeDecision);
	}

	@Override
	public void clearCache(
		List<PharmaApplicationCommitteeDecision>
			pharmaApplicationCommitteeDecisions) {

		for (PharmaApplicationCommitteeDecision
				pharmaApplicationCommitteeDecision :
					pharmaApplicationCommitteeDecisions) {

			entityCache.removeResult(
				PharmaApplicationCommitteeDecisionImpl.class,
				pharmaApplicationCommitteeDecision);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaApplicationCommitteeDecisionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PharmaApplicationCommitteeDecisionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PharmaApplicationCommitteeDecisionModelImpl
			pharmaApplicationCommitteeDecisionModelImpl) {

		Object[] args = new Object[] {
			pharmaApplicationCommitteeDecisionModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetPharma_CD_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPharma_CD_CI, args,
			pharmaApplicationCommitteeDecisionModelImpl);
	}

	/**
	 * Creates a new pharma application committee decision with the primary key. Does not add the pharma application committee decision to the database.
	 *
	 * @param pharmaCommitteeDecisionId the primary key for the new pharma application committee decision
	 * @return the new pharma application committee decision
	 */
	@Override
	public PharmaApplicationCommitteeDecision create(
		long pharmaCommitteeDecisionId) {

		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision =
			new PharmaApplicationCommitteeDecisionImpl();

		pharmaApplicationCommitteeDecision.setNew(true);
		pharmaApplicationCommitteeDecision.setPrimaryKey(
			pharmaCommitteeDecisionId);

		pharmaApplicationCommitteeDecision.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return pharmaApplicationCommitteeDecision;
	}

	/**
	 * Removes the pharma application committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the pharma application committee decision
	 * @return the pharma application committee decision that was removed
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a pharma application committee decision with the primary key could not be found
	 */
	@Override
	public PharmaApplicationCommitteeDecision remove(
			long pharmaCommitteeDecisionId)
		throws NoSuchPharmaApplicationCommitteeDecisionException {

		return remove((Serializable)pharmaCommitteeDecisionId);
	}

	/**
	 * Removes the pharma application committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma application committee decision
	 * @return the pharma application committee decision that was removed
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a pharma application committee decision with the primary key could not be found
	 */
	@Override
	public PharmaApplicationCommitteeDecision remove(Serializable primaryKey)
		throws NoSuchPharmaApplicationCommitteeDecisionException {

		Session session = null;

		try {
			session = openSession();

			PharmaApplicationCommitteeDecision
				pharmaApplicationCommitteeDecision =
					(PharmaApplicationCommitteeDecision)session.get(
						PharmaApplicationCommitteeDecisionImpl.class,
						primaryKey);

			if (pharmaApplicationCommitteeDecision == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaApplicationCommitteeDecisionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaApplicationCommitteeDecision);
		}
		catch (NoSuchPharmaApplicationCommitteeDecisionException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected PharmaApplicationCommitteeDecision removeImpl(
		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaApplicationCommitteeDecision)) {
				pharmaApplicationCommitteeDecision =
					(PharmaApplicationCommitteeDecision)session.get(
						PharmaApplicationCommitteeDecisionImpl.class,
						pharmaApplicationCommitteeDecision.getPrimaryKeyObj());
			}

			if (pharmaApplicationCommitteeDecision != null) {
				session.delete(pharmaApplicationCommitteeDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaApplicationCommitteeDecision != null) {
			clearCache(pharmaApplicationCommitteeDecision);
		}

		return pharmaApplicationCommitteeDecision;
	}

	@Override
	public PharmaApplicationCommitteeDecision updateImpl(
		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision) {

		boolean isNew = pharmaApplicationCommitteeDecision.isNew();

		if (!(pharmaApplicationCommitteeDecision instanceof
				PharmaApplicationCommitteeDecisionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					pharmaApplicationCommitteeDecision.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaApplicationCommitteeDecision);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaApplicationCommitteeDecision proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaApplicationCommitteeDecision implementation " +
					pharmaApplicationCommitteeDecision.getClass());
		}

		PharmaApplicationCommitteeDecisionModelImpl
			pharmaApplicationCommitteeDecisionModelImpl =
				(PharmaApplicationCommitteeDecisionModelImpl)
					pharmaApplicationCommitteeDecision;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(pharmaApplicationCommitteeDecision.getCreateDate() == null)) {

			if (serviceContext == null) {
				pharmaApplicationCommitteeDecision.setCreateDate(date);
			}
			else {
				pharmaApplicationCommitteeDecision.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!pharmaApplicationCommitteeDecisionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				pharmaApplicationCommitteeDecision.setModifiedDate(date);
			}
			else {
				pharmaApplicationCommitteeDecision.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaApplicationCommitteeDecision);
			}
			else {
				pharmaApplicationCommitteeDecision =
					(PharmaApplicationCommitteeDecision)session.merge(
						pharmaApplicationCommitteeDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaApplicationCommitteeDecisionImpl.class,
			pharmaApplicationCommitteeDecisionModelImpl, false, true);

		cacheUniqueFindersCache(pharmaApplicationCommitteeDecisionModelImpl);

		if (isNew) {
			pharmaApplicationCommitteeDecision.setNew(false);
		}

		pharmaApplicationCommitteeDecision.resetOriginalValues();

		return pharmaApplicationCommitteeDecision;
	}

	/**
	 * Returns the pharma application committee decision with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma application committee decision
	 * @return the pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a pharma application committee decision with the primary key could not be found
	 */
	@Override
	public PharmaApplicationCommitteeDecision findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchPharmaApplicationCommitteeDecisionException {

		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision =
			fetchByPrimaryKey(primaryKey);

		if (pharmaApplicationCommitteeDecision == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaApplicationCommitteeDecisionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaApplicationCommitteeDecision;
	}

	/**
	 * Returns the pharma application committee decision with the primary key or throws a <code>NoSuchPharmaApplicationCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the pharma application committee decision
	 * @return the pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a pharma application committee decision with the primary key could not be found
	 */
	@Override
	public PharmaApplicationCommitteeDecision findByPrimaryKey(
			long pharmaCommitteeDecisionId)
		throws NoSuchPharmaApplicationCommitteeDecisionException {

		return findByPrimaryKey((Serializable)pharmaCommitteeDecisionId);
	}

	/**
	 * Returns the pharma application committee decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the pharma application committee decision
	 * @return the pharma application committee decision, or <code>null</code> if a pharma application committee decision with the primary key could not be found
	 */
	@Override
	public PharmaApplicationCommitteeDecision fetchByPrimaryKey(
		long pharmaCommitteeDecisionId) {

		return fetchByPrimaryKey((Serializable)pharmaCommitteeDecisionId);
	}

	/**
	 * Returns all the pharma application committee decisions.
	 *
	 * @return the pharma application committee decisions
	 */
	@Override
	public List<PharmaApplicationCommitteeDecision> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma application committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @return the range of pharma application committee decisions
	 */
	@Override
	public List<PharmaApplicationCommitteeDecision> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma application committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma application committee decisions
	 */
	@Override
	public List<PharmaApplicationCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationCommitteeDecision>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma application committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma application committee decisions
	 */
	@Override
	public List<PharmaApplicationCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationCommitteeDecision> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<PharmaApplicationCommitteeDecision> list = null;

		if (useFinderCache) {
			list =
				(List<PharmaApplicationCommitteeDecision>)finderCache.getResult(
					finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMAAPPLICATIONCOMMITTEEDECISION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMAAPPLICATIONCOMMITTEEDECISION;

				sql = sql.concat(
					PharmaApplicationCommitteeDecisionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaApplicationCommitteeDecision>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the pharma application committee decisions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaApplicationCommitteeDecision
				pharmaApplicationCommitteeDecision : findAll()) {

			remove(pharmaApplicationCommitteeDecision);
		}
	}

	/**
	 * Returns the number of pharma application committee decisions.
	 *
	 * @return the number of pharma application committee decisions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_PHARMAAPPLICATIONCOMMITTEEDECISION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "pharmaCommitteeDecisionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMAAPPLICATIONCOMMITTEEDECISION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaApplicationCommitteeDecisionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma application committee decision persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetPharma_CD_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPharma_CD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetPharma_CD_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetPharma_CD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetPharma_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetPharma_By_CD",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"committeeDecision"}, true);

		_finderPathWithoutPaginationFindBygetPharma_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetPharma_By_CD",
			new String[] {String.class.getName()},
			new String[] {"committeeDecision"}, true);

		_finderPathCountBygetPharma_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetPharma_By_CD",
			new String[] {String.class.getName()},
			new String[] {"committeeDecision"}, false);

		_setPharmaApplicationCommitteeDecisionUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setPharmaApplicationCommitteeDecisionUtilPersistence(null);

		entityCache.removeCache(
			PharmaApplicationCommitteeDecisionImpl.class.getName());
	}

	private void _setPharmaApplicationCommitteeDecisionUtilPersistence(
		PharmaApplicationCommitteeDecisionPersistence
			pharmaApplicationCommitteeDecisionPersistence) {

		try {
			Field field =
				PharmaApplicationCommitteeDecisionUtil.class.getDeclaredField(
					"_persistence");

			field.setAccessible(true);

			field.set(null, pharmaApplicationCommitteeDecisionPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = PHARMA_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PHARMA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PHARMA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PHARMAAPPLICATIONCOMMITTEEDECISION =
		"SELECT pharmaApplicationCommitteeDecision FROM PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision";

	private static final String
		_SQL_SELECT_PHARMAAPPLICATIONCOMMITTEEDECISION_WHERE =
			"SELECT pharmaApplicationCommitteeDecision FROM PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision WHERE ";

	private static final String _SQL_COUNT_PHARMAAPPLICATIONCOMMITTEEDECISION =
		"SELECT COUNT(pharmaApplicationCommitteeDecision) FROM PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision";

	private static final String
		_SQL_COUNT_PHARMAAPPLICATIONCOMMITTEEDECISION_WHERE =
			"SELECT COUNT(pharmaApplicationCommitteeDecision) FROM PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"pharmaApplicationCommitteeDecision.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaApplicationCommitteeDecision exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaApplicationCommitteeDecision exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaApplicationCommitteeDecisionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PharmaApplicationCommitteeDecisionModelArgumentsResolver
		_pharmaApplicationCommitteeDecisionModelArgumentsResolver;

}