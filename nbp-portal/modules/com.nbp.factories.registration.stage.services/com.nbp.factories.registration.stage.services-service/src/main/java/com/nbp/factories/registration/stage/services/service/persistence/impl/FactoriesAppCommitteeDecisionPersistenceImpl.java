/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.factories.registration.stage.services.exception.NoSuchFactoriesAppCommitteeDecisionException;
import com.nbp.factories.registration.stage.services.model.FactoriesAppCommitteeDecision;
import com.nbp.factories.registration.stage.services.model.FactoriesAppCommitteeDecisionTable;
import com.nbp.factories.registration.stage.services.model.impl.FactoriesAppCommitteeDecisionImpl;
import com.nbp.factories.registration.stage.services.model.impl.FactoriesAppCommitteeDecisionModelImpl;
import com.nbp.factories.registration.stage.services.service.persistence.FactoriesAppCommitteeDecisionPersistence;
import com.nbp.factories.registration.stage.services.service.persistence.FactoriesAppCommitteeDecisionUtil;
import com.nbp.factories.registration.stage.services.service.persistence.impl.constants.FACTORIES_REGISTRATIONPersistenceConstants;

import java.io.Serializable;

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
 * The persistence implementation for the factories app committee decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FactoriesAppCommitteeDecisionPersistence.class)
public class FactoriesAppCommitteeDecisionPersistenceImpl
	extends BasePersistenceImpl<FactoriesAppCommitteeDecision>
	implements FactoriesAppCommitteeDecisionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FactoriesAppCommitteeDecisionUtil</code> to access the factories app committee decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FactoriesAppCommitteeDecisionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFactory_CD_CI;
	private FinderPath _finderPathCountBygetFactory_CD_CI;

	/**
	 * Returns the factories app committee decision where caseId = &#63; or throws a <code>NoSuchFactoriesAppCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a matching factories app committee decision could not be found
	 */
	@Override
	public FactoriesAppCommitteeDecision findBygetFactory_CD_CI(String caseId)
		throws NoSuchFactoriesAppCommitteeDecisionException {

		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision =
			fetchBygetFactory_CD_CI(caseId);

		if (factoriesAppCommitteeDecision == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesAppCommitteeDecisionException(
				sb.toString());
		}

		return factoriesAppCommitteeDecision;
	}

	/**
	 * Returns the factories app committee decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories app committee decision, or <code>null</code> if a matching factories app committee decision could not be found
	 */
	@Override
	public FactoriesAppCommitteeDecision fetchBygetFactory_CD_CI(
		String caseId) {

		return fetchBygetFactory_CD_CI(caseId, true);
	}

	/**
	 * Returns the factories app committee decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories app committee decision, or <code>null</code> if a matching factories app committee decision could not be found
	 */
	@Override
	public FactoriesAppCommitteeDecision fetchBygetFactory_CD_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFactory_CD_CI, finderArgs, this);
		}

		if (result instanceof FactoriesAppCommitteeDecision) {
			FactoriesAppCommitteeDecision factoriesAppCommitteeDecision =
				(FactoriesAppCommitteeDecision)result;

			if (!Objects.equals(
					caseId, factoriesAppCommitteeDecision.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FACTORIESAPPCOMMITTEEDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORY_CD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORY_CD_CI_CASEID_2);
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

				List<FactoriesAppCommitteeDecision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactory_CD_CI, finderArgs,
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
								"FactoriesAppCommitteeDecisionPersistenceImpl.fetchBygetFactory_CD_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesAppCommitteeDecision
						factoriesAppCommitteeDecision = list.get(0);

					result = factoriesAppCommitteeDecision;

					cacheResult(factoriesAppCommitteeDecision);
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
			return (FactoriesAppCommitteeDecision)result;
		}
	}

	/**
	 * Removes the factories app committee decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories app committee decision that was removed
	 */
	@Override
	public FactoriesAppCommitteeDecision removeBygetFactory_CD_CI(String caseId)
		throws NoSuchFactoriesAppCommitteeDecisionException {

		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision =
			findBygetFactory_CD_CI(caseId);

		return remove(factoriesAppCommitteeDecision);
	}

	/**
	 * Returns the number of factories app committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories app committee decisions
	 */
	@Override
	public int countBygetFactory_CD_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFactory_CD_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESAPPCOMMITTEEDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORY_CD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORY_CD_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETFACTORY_CD_CI_CASEID_2 =
		"factoriesAppCommitteeDecision.caseId = ?";

	private static final String _FINDER_COLUMN_GETFACTORY_CD_CI_CASEID_3 =
		"(factoriesAppCommitteeDecision.caseId IS NULL OR factoriesAppCommitteeDecision.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetFactory_By_CD;
	private FinderPath _finderPathWithoutPaginationFindBygetFactory_By_CD;
	private FinderPath _finderPathCountBygetFactory_By_CD;

	/**
	 * Returns all the factories app committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching factories app committee decisions
	 */
	@Override
	public List<FactoriesAppCommitteeDecision> findBygetFactory_By_CD(
		String committeeDecision) {

		return findBygetFactory_By_CD(
			committeeDecision, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @return the range of matching factories app committee decisions
	 */
	@Override
	public List<FactoriesAppCommitteeDecision> findBygetFactory_By_CD(
		String committeeDecision, int start, int end) {

		return findBygetFactory_By_CD(committeeDecision, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories app committee decisions
	 */
	@Override
	public List<FactoriesAppCommitteeDecision> findBygetFactory_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator) {

		return findBygetFactory_By_CD(
			committeeDecision, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories app committee decisions
	 */
	@Override
	public List<FactoriesAppCommitteeDecision> findBygetFactory_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator,
		boolean useFinderCache) {

		committeeDecision = Objects.toString(committeeDecision, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFactory_By_CD;
				finderArgs = new Object[] {committeeDecision};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFactory_By_CD;
			finderArgs = new Object[] {
				committeeDecision, start, end, orderByComparator
			};
		}

		List<FactoriesAppCommitteeDecision> list = null;

		if (useFinderCache) {
			list = (List<FactoriesAppCommitteeDecision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesAppCommitteeDecision
						factoriesAppCommitteeDecision : list) {

					if (!committeeDecision.equals(
							factoriesAppCommitteeDecision.
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

			sb.append(_SQL_SELECT_FACTORIESAPPCOMMITTEEDECISION_WHERE);

			boolean bindCommitteeDecision = false;

			if (committeeDecision.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORY_BY_CD_COMMITTEEDECISION_3);
			}
			else {
				bindCommitteeDecision = true;

				sb.append(_FINDER_COLUMN_GETFACTORY_BY_CD_COMMITTEEDECISION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FactoriesAppCommitteeDecisionModelImpl.ORDER_BY_JPQL);
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

				list = (List<FactoriesAppCommitteeDecision>)QueryUtil.list(
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
	 * Returns the first factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a matching factories app committee decision could not be found
	 */
	@Override
	public FactoriesAppCommitteeDecision findBygetFactory_By_CD_First(
			String committeeDecision,
			OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator)
		throws NoSuchFactoriesAppCommitteeDecisionException {

		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision =
			fetchBygetFactory_By_CD_First(committeeDecision, orderByComparator);

		if (factoriesAppCommitteeDecision != null) {
			return factoriesAppCommitteeDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("committeeDecision=");
		sb.append(committeeDecision);

		sb.append("}");

		throw new NoSuchFactoriesAppCommitteeDecisionException(sb.toString());
	}

	/**
	 * Returns the first factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories app committee decision, or <code>null</code> if a matching factories app committee decision could not be found
	 */
	@Override
	public FactoriesAppCommitteeDecision fetchBygetFactory_By_CD_First(
		String committeeDecision,
		OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator) {

		List<FactoriesAppCommitteeDecision> list = findBygetFactory_By_CD(
			committeeDecision, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a matching factories app committee decision could not be found
	 */
	@Override
	public FactoriesAppCommitteeDecision findBygetFactory_By_CD_Last(
			String committeeDecision,
			OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator)
		throws NoSuchFactoriesAppCommitteeDecisionException {

		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision =
			fetchBygetFactory_By_CD_Last(committeeDecision, orderByComparator);

		if (factoriesAppCommitteeDecision != null) {
			return factoriesAppCommitteeDecision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("committeeDecision=");
		sb.append(committeeDecision);

		sb.append("}");

		throw new NoSuchFactoriesAppCommitteeDecisionException(sb.toString());
	}

	/**
	 * Returns the last factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories app committee decision, or <code>null</code> if a matching factories app committee decision could not be found
	 */
	@Override
	public FactoriesAppCommitteeDecision fetchBygetFactory_By_CD_Last(
		String committeeDecision,
		OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator) {

		int count = countBygetFactory_By_CD(committeeDecision);

		if (count == 0) {
			return null;
		}

		List<FactoriesAppCommitteeDecision> list = findBygetFactory_By_CD(
			committeeDecision, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories app committee decisions before and after the current factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param factoriesAppCommiDecId the primary key of the current factories app committee decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a factories app committee decision with the primary key could not be found
	 */
	@Override
	public FactoriesAppCommitteeDecision[] findBygetFactory_By_CD_PrevAndNext(
			long factoriesAppCommiDecId, String committeeDecision,
			OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator)
		throws NoSuchFactoriesAppCommitteeDecisionException {

		committeeDecision = Objects.toString(committeeDecision, "");

		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision =
			findByPrimaryKey(factoriesAppCommiDecId);

		Session session = null;

		try {
			session = openSession();

			FactoriesAppCommitteeDecision[] array =
				new FactoriesAppCommitteeDecisionImpl[3];

			array[0] = getBygetFactory_By_CD_PrevAndNext(
				session, factoriesAppCommitteeDecision, committeeDecision,
				orderByComparator, true);

			array[1] = factoriesAppCommitteeDecision;

			array[2] = getBygetFactory_By_CD_PrevAndNext(
				session, factoriesAppCommitteeDecision, committeeDecision,
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

	protected FactoriesAppCommitteeDecision getBygetFactory_By_CD_PrevAndNext(
		Session session,
		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision,
		String committeeDecision,
		OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORIESAPPCOMMITTEEDECISION_WHERE);

		boolean bindCommitteeDecision = false;

		if (committeeDecision.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFACTORY_BY_CD_COMMITTEEDECISION_3);
		}
		else {
			bindCommitteeDecision = true;

			sb.append(_FINDER_COLUMN_GETFACTORY_BY_CD_COMMITTEEDECISION_2);
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
			sb.append(FactoriesAppCommitteeDecisionModelImpl.ORDER_BY_JPQL);
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
						factoriesAppCommitteeDecision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesAppCommitteeDecision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories app committee decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	@Override
	public void removeBygetFactory_By_CD(String committeeDecision) {
		for (FactoriesAppCommitteeDecision factoriesAppCommitteeDecision :
				findBygetFactory_By_CD(
					committeeDecision, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(factoriesAppCommitteeDecision);
		}
	}

	/**
	 * Returns the number of factories app committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching factories app committee decisions
	 */
	@Override
	public int countBygetFactory_By_CD(String committeeDecision) {
		committeeDecision = Objects.toString(committeeDecision, "");

		FinderPath finderPath = _finderPathCountBygetFactory_By_CD;

		Object[] finderArgs = new Object[] {committeeDecision};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESAPPCOMMITTEEDECISION_WHERE);

			boolean bindCommitteeDecision = false;

			if (committeeDecision.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORY_BY_CD_COMMITTEEDECISION_3);
			}
			else {
				bindCommitteeDecision = true;

				sb.append(_FINDER_COLUMN_GETFACTORY_BY_CD_COMMITTEEDECISION_2);
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
		_FINDER_COLUMN_GETFACTORY_BY_CD_COMMITTEEDECISION_2 =
			"factoriesAppCommitteeDecision.committeeDecision = ?";

	private static final String
		_FINDER_COLUMN_GETFACTORY_BY_CD_COMMITTEEDECISION_3 =
			"(factoriesAppCommitteeDecision.committeeDecision IS NULL OR factoriesAppCommitteeDecision.committeeDecision = '')";

	public FactoriesAppCommitteeDecisionPersistenceImpl() {
		setModelClass(FactoriesAppCommitteeDecision.class);

		setModelImplClass(FactoriesAppCommitteeDecisionImpl.class);
		setModelPKClass(long.class);

		setTable(FactoriesAppCommitteeDecisionTable.INSTANCE);
	}

	/**
	 * Caches the factories app committee decision in the entity cache if it is enabled.
	 *
	 * @param factoriesAppCommitteeDecision the factories app committee decision
	 */
	@Override
	public void cacheResult(
		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision) {

		entityCache.putResult(
			FactoriesAppCommitteeDecisionImpl.class,
			factoriesAppCommitteeDecision.getPrimaryKey(),
			factoriesAppCommitteeDecision);

		finderCache.putResult(
			_finderPathFetchBygetFactory_CD_CI,
			new Object[] {factoriesAppCommitteeDecision.getCaseId()},
			factoriesAppCommitteeDecision);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the factories app committee decisions in the entity cache if it is enabled.
	 *
	 * @param factoriesAppCommitteeDecisions the factories app committee decisions
	 */
	@Override
	public void cacheResult(
		List<FactoriesAppCommitteeDecision> factoriesAppCommitteeDecisions) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (factoriesAppCommitteeDecisions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FactoriesAppCommitteeDecision factoriesAppCommitteeDecision :
				factoriesAppCommitteeDecisions) {

			if (entityCache.getResult(
					FactoriesAppCommitteeDecisionImpl.class,
					factoriesAppCommitteeDecision.getPrimaryKey()) == null) {

				cacheResult(factoriesAppCommitteeDecision);
			}
		}
	}

	/**
	 * Clears the cache for all factories app committee decisions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FactoriesAppCommitteeDecisionImpl.class);

		finderCache.clearCache(FactoriesAppCommitteeDecisionImpl.class);
	}

	/**
	 * Clears the cache for the factories app committee decision.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision) {

		entityCache.removeResult(
			FactoriesAppCommitteeDecisionImpl.class,
			factoriesAppCommitteeDecision);
	}

	@Override
	public void clearCache(
		List<FactoriesAppCommitteeDecision> factoriesAppCommitteeDecisions) {

		for (FactoriesAppCommitteeDecision factoriesAppCommitteeDecision :
				factoriesAppCommitteeDecisions) {

			entityCache.removeResult(
				FactoriesAppCommitteeDecisionImpl.class,
				factoriesAppCommitteeDecision);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FactoriesAppCommitteeDecisionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FactoriesAppCommitteeDecisionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FactoriesAppCommitteeDecisionModelImpl
			factoriesAppCommitteeDecisionModelImpl) {

		Object[] args = new Object[] {
			factoriesAppCommitteeDecisionModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetFactory_CD_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactory_CD_CI, args,
			factoriesAppCommitteeDecisionModelImpl);
	}

	/**
	 * Creates a new factories app committee decision with the primary key. Does not add the factories app committee decision to the database.
	 *
	 * @param factoriesAppCommiDecId the primary key for the new factories app committee decision
	 * @return the new factories app committee decision
	 */
	@Override
	public FactoriesAppCommitteeDecision create(long factoriesAppCommiDecId) {
		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision =
			new FactoriesAppCommitteeDecisionImpl();

		factoriesAppCommitteeDecision.setNew(true);
		factoriesAppCommitteeDecision.setPrimaryKey(factoriesAppCommiDecId);

		factoriesAppCommitteeDecision.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return factoriesAppCommitteeDecision;
	}

	/**
	 * Removes the factories app committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesAppCommiDecId the primary key of the factories app committee decision
	 * @return the factories app committee decision that was removed
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a factories app committee decision with the primary key could not be found
	 */
	@Override
	public FactoriesAppCommitteeDecision remove(long factoriesAppCommiDecId)
		throws NoSuchFactoriesAppCommitteeDecisionException {

		return remove((Serializable)factoriesAppCommiDecId);
	}

	/**
	 * Removes the factories app committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the factories app committee decision
	 * @return the factories app committee decision that was removed
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a factories app committee decision with the primary key could not be found
	 */
	@Override
	public FactoriesAppCommitteeDecision remove(Serializable primaryKey)
		throws NoSuchFactoriesAppCommitteeDecisionException {

		Session session = null;

		try {
			session = openSession();

			FactoriesAppCommitteeDecision factoriesAppCommitteeDecision =
				(FactoriesAppCommitteeDecision)session.get(
					FactoriesAppCommitteeDecisionImpl.class, primaryKey);

			if (factoriesAppCommitteeDecision == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFactoriesAppCommitteeDecisionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(factoriesAppCommitteeDecision);
		}
		catch (NoSuchFactoriesAppCommitteeDecisionException
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
	protected FactoriesAppCommitteeDecision removeImpl(
		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(factoriesAppCommitteeDecision)) {
				factoriesAppCommitteeDecision =
					(FactoriesAppCommitteeDecision)session.get(
						FactoriesAppCommitteeDecisionImpl.class,
						factoriesAppCommitteeDecision.getPrimaryKeyObj());
			}

			if (factoriesAppCommitteeDecision != null) {
				session.delete(factoriesAppCommitteeDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (factoriesAppCommitteeDecision != null) {
			clearCache(factoriesAppCommitteeDecision);
		}

		return factoriesAppCommitteeDecision;
	}

	@Override
	public FactoriesAppCommitteeDecision updateImpl(
		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision) {

		boolean isNew = factoriesAppCommitteeDecision.isNew();

		if (!(factoriesAppCommitteeDecision instanceof
				FactoriesAppCommitteeDecisionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					factoriesAppCommitteeDecision.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					factoriesAppCommitteeDecision);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in factoriesAppCommitteeDecision proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FactoriesAppCommitteeDecision implementation " +
					factoriesAppCommitteeDecision.getClass());
		}

		FactoriesAppCommitteeDecisionModelImpl
			factoriesAppCommitteeDecisionModelImpl =
				(FactoriesAppCommitteeDecisionModelImpl)
					factoriesAppCommitteeDecision;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (factoriesAppCommitteeDecision.getCreateDate() == null)) {
			if (serviceContext == null) {
				factoriesAppCommitteeDecision.setCreateDate(date);
			}
			else {
				factoriesAppCommitteeDecision.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!factoriesAppCommitteeDecisionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				factoriesAppCommitteeDecision.setModifiedDate(date);
			}
			else {
				factoriesAppCommitteeDecision.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(factoriesAppCommitteeDecision);
			}
			else {
				factoriesAppCommitteeDecision =
					(FactoriesAppCommitteeDecision)session.merge(
						factoriesAppCommitteeDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FactoriesAppCommitteeDecisionImpl.class,
			factoriesAppCommitteeDecisionModelImpl, false, true);

		cacheUniqueFindersCache(factoriesAppCommitteeDecisionModelImpl);

		if (isNew) {
			factoriesAppCommitteeDecision.setNew(false);
		}

		factoriesAppCommitteeDecision.resetOriginalValues();

		return factoriesAppCommitteeDecision;
	}

	/**
	 * Returns the factories app committee decision with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the factories app committee decision
	 * @return the factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a factories app committee decision with the primary key could not be found
	 */
	@Override
	public FactoriesAppCommitteeDecision findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchFactoriesAppCommitteeDecisionException {

		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision =
			fetchByPrimaryKey(primaryKey);

		if (factoriesAppCommitteeDecision == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFactoriesAppCommitteeDecisionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return factoriesAppCommitteeDecision;
	}

	/**
	 * Returns the factories app committee decision with the primary key or throws a <code>NoSuchFactoriesAppCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param factoriesAppCommiDecId the primary key of the factories app committee decision
	 * @return the factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a factories app committee decision with the primary key could not be found
	 */
	@Override
	public FactoriesAppCommitteeDecision findByPrimaryKey(
			long factoriesAppCommiDecId)
		throws NoSuchFactoriesAppCommitteeDecisionException {

		return findByPrimaryKey((Serializable)factoriesAppCommiDecId);
	}

	/**
	 * Returns the factories app committee decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesAppCommiDecId the primary key of the factories app committee decision
	 * @return the factories app committee decision, or <code>null</code> if a factories app committee decision with the primary key could not be found
	 */
	@Override
	public FactoriesAppCommitteeDecision fetchByPrimaryKey(
		long factoriesAppCommiDecId) {

		return fetchByPrimaryKey((Serializable)factoriesAppCommiDecId);
	}

	/**
	 * Returns all the factories app committee decisions.
	 *
	 * @return the factories app committee decisions
	 */
	@Override
	public List<FactoriesAppCommitteeDecision> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @return the range of factories app committee decisions
	 */
	@Override
	public List<FactoriesAppCommitteeDecision> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories app committee decisions
	 */
	@Override
	public List<FactoriesAppCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories app committee decisions
	 */
	@Override
	public List<FactoriesAppCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator,
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

		List<FactoriesAppCommitteeDecision> list = null;

		if (useFinderCache) {
			list = (List<FactoriesAppCommitteeDecision>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FACTORIESAPPCOMMITTEEDECISION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FACTORIESAPPCOMMITTEEDECISION;

				sql = sql.concat(
					FactoriesAppCommitteeDecisionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FactoriesAppCommitteeDecision>)QueryUtil.list(
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
	 * Removes all the factories app committee decisions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FactoriesAppCommitteeDecision factoriesAppCommitteeDecision :
				findAll()) {

			remove(factoriesAppCommitteeDecision);
		}
	}

	/**
	 * Returns the number of factories app committee decisions.
	 *
	 * @return the number of factories app committee decisions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_FACTORIESAPPCOMMITTEEDECISION);

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
		return "factoriesAppCommiDecId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FACTORIESAPPCOMMITTEEDECISION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FactoriesAppCommitteeDecisionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the factories app committee decision persistence.
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

		_finderPathFetchBygetFactory_CD_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFactory_CD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFactory_CD_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactory_CD_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetFactory_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFactory_By_CD",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"committeeDecision"}, true);

		_finderPathWithoutPaginationFindBygetFactory_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFactory_By_CD",
			new String[] {String.class.getName()},
			new String[] {"committeeDecision"}, true);

		_finderPathCountBygetFactory_By_CD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactory_By_CD", new String[] {String.class.getName()},
			new String[] {"committeeDecision"}, false);

		FactoriesAppCommitteeDecisionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FactoriesAppCommitteeDecisionUtil.setPersistence(null);

		entityCache.removeCache(
			FactoriesAppCommitteeDecisionImpl.class.getName());
	}

	@Override
	@Reference(
		target = FACTORIES_REGISTRATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FACTORIES_REGISTRATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FACTORIES_REGISTRATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FACTORIESAPPCOMMITTEEDECISION =
		"SELECT factoriesAppCommitteeDecision FROM FactoriesAppCommitteeDecision factoriesAppCommitteeDecision";

	private static final String
		_SQL_SELECT_FACTORIESAPPCOMMITTEEDECISION_WHERE =
			"SELECT factoriesAppCommitteeDecision FROM FactoriesAppCommitteeDecision factoriesAppCommitteeDecision WHERE ";

	private static final String _SQL_COUNT_FACTORIESAPPCOMMITTEEDECISION =
		"SELECT COUNT(factoriesAppCommitteeDecision) FROM FactoriesAppCommitteeDecision factoriesAppCommitteeDecision";

	private static final String _SQL_COUNT_FACTORIESAPPCOMMITTEEDECISION_WHERE =
		"SELECT COUNT(factoriesAppCommitteeDecision) FROM FactoriesAppCommitteeDecision factoriesAppCommitteeDecision WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"factoriesAppCommitteeDecision.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FactoriesAppCommitteeDecision exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FactoriesAppCommitteeDecision exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FactoriesAppCommitteeDecisionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}