/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence.impl;

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

import com.nbp.quary.application.form.service.exception.NoSuchQuarryCurrentStageException;
import com.nbp.quary.application.form.service.model.QuarryCurrentStage;
import com.nbp.quary.application.form.service.model.QuarryCurrentStageTable;
import com.nbp.quary.application.form.service.model.impl.QuarryCurrentStageImpl;
import com.nbp.quary.application.form.service.model.impl.QuarryCurrentStageModelImpl;
import com.nbp.quary.application.form.service.service.persistence.QuarryCurrentStagePersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryCurrentStageUtil;
import com.nbp.quary.application.form.service.service.persistence.impl.constants.QUARRY_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the quarry current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuarryCurrentStagePersistence.class)
public class QuarryCurrentStagePersistenceImpl
	extends BasePersistenceImpl<QuarryCurrentStage>
	implements QuarryCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuarryCurrentStageUtil</code> to access the quarry current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuarryCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetQuarry_ById;
	private FinderPath _finderPathCountBygetQuarry_ById;

	/**
	 * Returns the quarry current stage where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryCurrentStageException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a matching quarry current stage could not be found
	 */
	@Override
	public QuarryCurrentStage findBygetQuarry_ById(long quarryApplicationId)
		throws NoSuchQuarryCurrentStageException {

		QuarryCurrentStage quarryCurrentStage = fetchBygetQuarry_ById(
			quarryApplicationId);

		if (quarryCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("quarryApplicationId=");
			sb.append(quarryApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryCurrentStageException(sb.toString());
		}

		return quarryCurrentStage;
	}

	/**
	 * Returns the quarry current stage where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry current stage, or <code>null</code> if a matching quarry current stage could not be found
	 */
	@Override
	public QuarryCurrentStage fetchBygetQuarry_ById(long quarryApplicationId) {
		return fetchBygetQuarry_ById(quarryApplicationId, true);
	}

	/**
	 * Returns the quarry current stage where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry current stage, or <code>null</code> if a matching quarry current stage could not be found
	 */
	@Override
	public QuarryCurrentStage fetchBygetQuarry_ById(
		long quarryApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {quarryApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQuarry_ById, finderArgs, this);
		}

		if (result instanceof QuarryCurrentStage) {
			QuarryCurrentStage quarryCurrentStage = (QuarryCurrentStage)result;

			if (quarryApplicationId !=
					quarryCurrentStage.getQuarryApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				List<QuarryCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarry_ById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {quarryApplicationId};
							}

							_log.warn(
								"QuarryCurrentStagePersistenceImpl.fetchBygetQuarry_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryCurrentStage quarryCurrentStage = list.get(0);

					result = quarryCurrentStage;

					cacheResult(quarryCurrentStage);
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
			return (QuarryCurrentStage)result;
		}
	}

	/**
	 * Removes the quarry current stage where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry current stage that was removed
	 */
	@Override
	public QuarryCurrentStage removeBygetQuarry_ById(long quarryApplicationId)
		throws NoSuchQuarryCurrentStageException {

		QuarryCurrentStage quarryCurrentStage = findBygetQuarry_ById(
			quarryApplicationId);

		return remove(quarryCurrentStage);
	}

	/**
	 * Returns the number of quarry current stages where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry current stages
	 */
	@Override
	public int countBygetQuarry_ById(long quarryApplicationId) {
		FinderPath finderPath = _finderPathCountBygetQuarry_ById;

		Object[] finderArgs = new Object[] {quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

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
		_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2 =
			"quarryCurrentStage.quarryApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetQuarry_CS_AI;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarry_CS_AI;
	private FinderPath _finderPathCountBygetQuarry_CS_AI;

	/**
	 * Returns all the quarry current stages where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry current stages
	 */
	@Override
	public List<QuarryCurrentStage> findBygetQuarry_CS_AI(
		long quarryApplicationId) {

		return findBygetQuarry_CS_AI(
			quarryApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry current stages where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @return the range of matching quarry current stages
	 */
	@Override
	public List<QuarryCurrentStage> findBygetQuarry_CS_AI(
		long quarryApplicationId, int start, int end) {

		return findBygetQuarry_CS_AI(quarryApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry current stages where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry current stages
	 */
	@Override
	public List<QuarryCurrentStage> findBygetQuarry_CS_AI(
		long quarryApplicationId, int start, int end,
		OrderByComparator<QuarryCurrentStage> orderByComparator) {

		return findBygetQuarry_CS_AI(
			quarryApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry current stages where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry current stages
	 */
	@Override
	public List<QuarryCurrentStage> findBygetQuarry_CS_AI(
		long quarryApplicationId, int start, int end,
		OrderByComparator<QuarryCurrentStage> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetQuarry_CS_AI;
				finderArgs = new Object[] {quarryApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarry_CS_AI;
			finderArgs = new Object[] {
				quarryApplicationId, start, end, orderByComparator
			};
		}

		List<QuarryCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<QuarryCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryCurrentStage quarryCurrentStage : list) {
					if (quarryApplicationId !=
							quarryCurrentStage.getQuarryApplicationId()) {

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

			sb.append(_SQL_SELECT_QUARRYCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_CS_AI_QUARRYAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QuarryCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				list = (List<QuarryCurrentStage>)QueryUtil.list(
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
	 * Returns the first quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a matching quarry current stage could not be found
	 */
	@Override
	public QuarryCurrentStage findBygetQuarry_CS_AI_First(
			long quarryApplicationId,
			OrderByComparator<QuarryCurrentStage> orderByComparator)
		throws NoSuchQuarryCurrentStageException {

		QuarryCurrentStage quarryCurrentStage = fetchBygetQuarry_CS_AI_First(
			quarryApplicationId, orderByComparator);

		if (quarryCurrentStage != null) {
			return quarryCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append("}");

		throw new NoSuchQuarryCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry current stage, or <code>null</code> if a matching quarry current stage could not be found
	 */
	@Override
	public QuarryCurrentStage fetchBygetQuarry_CS_AI_First(
		long quarryApplicationId,
		OrderByComparator<QuarryCurrentStage> orderByComparator) {

		List<QuarryCurrentStage> list = findBygetQuarry_CS_AI(
			quarryApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a matching quarry current stage could not be found
	 */
	@Override
	public QuarryCurrentStage findBygetQuarry_CS_AI_Last(
			long quarryApplicationId,
			OrderByComparator<QuarryCurrentStage> orderByComparator)
		throws NoSuchQuarryCurrentStageException {

		QuarryCurrentStage quarryCurrentStage = fetchBygetQuarry_CS_AI_Last(
			quarryApplicationId, orderByComparator);

		if (quarryCurrentStage != null) {
			return quarryCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append("}");

		throw new NoSuchQuarryCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry current stage, or <code>null</code> if a matching quarry current stage could not be found
	 */
	@Override
	public QuarryCurrentStage fetchBygetQuarry_CS_AI_Last(
		long quarryApplicationId,
		OrderByComparator<QuarryCurrentStage> orderByComparator) {

		int count = countBygetQuarry_CS_AI(quarryApplicationId);

		if (count == 0) {
			return null;
		}

		List<QuarryCurrentStage> list = findBygetQuarry_CS_AI(
			quarryApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry current stages before and after the current quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param auarryStageId the primary key of the current quarry current stage
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a quarry current stage with the primary key could not be found
	 */
	@Override
	public QuarryCurrentStage[] findBygetQuarry_CS_AI_PrevAndNext(
			long auarryStageId, long quarryApplicationId,
			OrderByComparator<QuarryCurrentStage> orderByComparator)
		throws NoSuchQuarryCurrentStageException {

		QuarryCurrentStage quarryCurrentStage = findByPrimaryKey(auarryStageId);

		Session session = null;

		try {
			session = openSession();

			QuarryCurrentStage[] array = new QuarryCurrentStageImpl[3];

			array[0] = getBygetQuarry_CS_AI_PrevAndNext(
				session, quarryCurrentStage, quarryApplicationId,
				orderByComparator, true);

			array[1] = quarryCurrentStage;

			array[2] = getBygetQuarry_CS_AI_PrevAndNext(
				session, quarryCurrentStage, quarryApplicationId,
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

	protected QuarryCurrentStage getBygetQuarry_CS_AI_PrevAndNext(
		Session session, QuarryCurrentStage quarryCurrentStage,
		long quarryApplicationId,
		OrderByComparator<QuarryCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYCURRENTSTAGE_WHERE);

		sb.append(_FINDER_COLUMN_GETQUARRY_CS_AI_QUARRYAPPLICATIONID_2);

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
			sb.append(QuarryCurrentStageModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(quarryApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry current stages where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	@Override
	public void removeBygetQuarry_CS_AI(long quarryApplicationId) {
		for (QuarryCurrentStage quarryCurrentStage :
				findBygetQuarry_CS_AI(
					quarryApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(quarryCurrentStage);
		}
	}

	/**
	 * Returns the number of quarry current stages where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry current stages
	 */
	@Override
	public int countBygetQuarry_CS_AI(long quarryApplicationId) {
		FinderPath finderPath = _finderPathCountBygetQuarry_CS_AI;

		Object[] finderArgs = new Object[] {quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_CS_AI_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

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
		_FINDER_COLUMN_GETQUARRY_CS_AI_QUARRYAPPLICATIONID_2 =
			"quarryCurrentStage.quarryApplicationId = ?";

	public QuarryCurrentStagePersistenceImpl() {
		setModelClass(QuarryCurrentStage.class);

		setModelImplClass(QuarryCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(QuarryCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the quarry current stage in the entity cache if it is enabled.
	 *
	 * @param quarryCurrentStage the quarry current stage
	 */
	@Override
	public void cacheResult(QuarryCurrentStage quarryCurrentStage) {
		entityCache.putResult(
			QuarryCurrentStageImpl.class, quarryCurrentStage.getPrimaryKey(),
			quarryCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetQuarry_ById,
			new Object[] {quarryCurrentStage.getQuarryApplicationId()},
			quarryCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quarry current stages in the entity cache if it is enabled.
	 *
	 * @param quarryCurrentStages the quarry current stages
	 */
	@Override
	public void cacheResult(List<QuarryCurrentStage> quarryCurrentStages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (quarryCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QuarryCurrentStage quarryCurrentStage : quarryCurrentStages) {
			if (entityCache.getResult(
					QuarryCurrentStageImpl.class,
					quarryCurrentStage.getPrimaryKey()) == null) {

				cacheResult(quarryCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all quarry current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QuarryCurrentStageImpl.class);

		finderCache.clearCache(QuarryCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the quarry current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QuarryCurrentStage quarryCurrentStage) {
		entityCache.removeResult(
			QuarryCurrentStageImpl.class, quarryCurrentStage);
	}

	@Override
	public void clearCache(List<QuarryCurrentStage> quarryCurrentStages) {
		for (QuarryCurrentStage quarryCurrentStage : quarryCurrentStages) {
			entityCache.removeResult(
				QuarryCurrentStageImpl.class, quarryCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QuarryCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(QuarryCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QuarryCurrentStageModelImpl quarryCurrentStageModelImpl) {

		Object[] args = new Object[] {
			quarryCurrentStageModelImpl.getQuarryApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarry_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarry_ById, args,
			quarryCurrentStageModelImpl);
	}

	/**
	 * Creates a new quarry current stage with the primary key. Does not add the quarry current stage to the database.
	 *
	 * @param auarryStageId the primary key for the new quarry current stage
	 * @return the new quarry current stage
	 */
	@Override
	public QuarryCurrentStage create(long auarryStageId) {
		QuarryCurrentStage quarryCurrentStage = new QuarryCurrentStageImpl();

		quarryCurrentStage.setNew(true);
		quarryCurrentStage.setPrimaryKey(auarryStageId);

		quarryCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return quarryCurrentStage;
	}

	/**
	 * Removes the quarry current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auarryStageId the primary key of the quarry current stage
	 * @return the quarry current stage that was removed
	 * @throws NoSuchQuarryCurrentStageException if a quarry current stage with the primary key could not be found
	 */
	@Override
	public QuarryCurrentStage remove(long auarryStageId)
		throws NoSuchQuarryCurrentStageException {

		return remove((Serializable)auarryStageId);
	}

	/**
	 * Removes the quarry current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarry current stage
	 * @return the quarry current stage that was removed
	 * @throws NoSuchQuarryCurrentStageException if a quarry current stage with the primary key could not be found
	 */
	@Override
	public QuarryCurrentStage remove(Serializable primaryKey)
		throws NoSuchQuarryCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			QuarryCurrentStage quarryCurrentStage =
				(QuarryCurrentStage)session.get(
					QuarryCurrentStageImpl.class, primaryKey);

			if (quarryCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuarryCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(quarryCurrentStage);
		}
		catch (NoSuchQuarryCurrentStageException noSuchEntityException) {
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
	protected QuarryCurrentStage removeImpl(
		QuarryCurrentStage quarryCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarryCurrentStage)) {
				quarryCurrentStage = (QuarryCurrentStage)session.get(
					QuarryCurrentStageImpl.class,
					quarryCurrentStage.getPrimaryKeyObj());
			}

			if (quarryCurrentStage != null) {
				session.delete(quarryCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (quarryCurrentStage != null) {
			clearCache(quarryCurrentStage);
		}

		return quarryCurrentStage;
	}

	@Override
	public QuarryCurrentStage updateImpl(
		QuarryCurrentStage quarryCurrentStage) {

		boolean isNew = quarryCurrentStage.isNew();

		if (!(quarryCurrentStage instanceof QuarryCurrentStageModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(quarryCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					quarryCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in quarryCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QuarryCurrentStage implementation " +
					quarryCurrentStage.getClass());
		}

		QuarryCurrentStageModelImpl quarryCurrentStageModelImpl =
			(QuarryCurrentStageModelImpl)quarryCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (quarryCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				quarryCurrentStage.setCreateDate(date);
			}
			else {
				quarryCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!quarryCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				quarryCurrentStage.setModifiedDate(date);
			}
			else {
				quarryCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(quarryCurrentStage);
			}
			else {
				quarryCurrentStage = (QuarryCurrentStage)session.merge(
					quarryCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QuarryCurrentStageImpl.class, quarryCurrentStageModelImpl, false,
			true);

		cacheUniqueFindersCache(quarryCurrentStageModelImpl);

		if (isNew) {
			quarryCurrentStage.setNew(false);
		}

		quarryCurrentStage.resetOriginalValues();

		return quarryCurrentStage;
	}

	/**
	 * Returns the quarry current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarry current stage
	 * @return the quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a quarry current stage with the primary key could not be found
	 */
	@Override
	public QuarryCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQuarryCurrentStageException {

		QuarryCurrentStage quarryCurrentStage = fetchByPrimaryKey(primaryKey);

		if (quarryCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuarryCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return quarryCurrentStage;
	}

	/**
	 * Returns the quarry current stage with the primary key or throws a <code>NoSuchQuarryCurrentStageException</code> if it could not be found.
	 *
	 * @param auarryStageId the primary key of the quarry current stage
	 * @return the quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a quarry current stage with the primary key could not be found
	 */
	@Override
	public QuarryCurrentStage findByPrimaryKey(long auarryStageId)
		throws NoSuchQuarryCurrentStageException {

		return findByPrimaryKey((Serializable)auarryStageId);
	}

	/**
	 * Returns the quarry current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auarryStageId the primary key of the quarry current stage
	 * @return the quarry current stage, or <code>null</code> if a quarry current stage with the primary key could not be found
	 */
	@Override
	public QuarryCurrentStage fetchByPrimaryKey(long auarryStageId) {
		return fetchByPrimaryKey((Serializable)auarryStageId);
	}

	/**
	 * Returns all the quarry current stages.
	 *
	 * @return the quarry current stages
	 */
	@Override
	public List<QuarryCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @return the range of quarry current stages
	 */
	@Override
	public List<QuarryCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry current stages
	 */
	@Override
	public List<QuarryCurrentStage> findAll(
		int start, int end,
		OrderByComparator<QuarryCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry current stages
	 */
	@Override
	public List<QuarryCurrentStage> findAll(
		int start, int end,
		OrderByComparator<QuarryCurrentStage> orderByComparator,
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

		List<QuarryCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<QuarryCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUARRYCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUARRYCURRENTSTAGE;

				sql = sql.concat(QuarryCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QuarryCurrentStage>)QueryUtil.list(
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
	 * Removes all the quarry current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QuarryCurrentStage quarryCurrentStage : findAll()) {
			remove(quarryCurrentStage);
		}
	}

	/**
	 * Returns the number of quarry current stages.
	 *
	 * @return the number of quarry current stages
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
					_SQL_COUNT_QUARRYCURRENTSTAGE);

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
		return "auarryStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUARRYCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuarryCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarry current stage persistence.
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

		_finderPathFetchBygetQuarry_ById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarry_ById",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, true);

		_finderPathCountBygetQuarry_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetQuarry_ById",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, false);

		_finderPathWithPaginationFindBygetQuarry_CS_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetQuarry_CS_AI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"quarryApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetQuarry_CS_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetQuarry_CS_AI",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, true);

		_finderPathCountBygetQuarry_CS_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetQuarry_CS_AI",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, false);

		QuarryCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QuarryCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(QuarryCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_QUARRYCURRENTSTAGE =
		"SELECT quarryCurrentStage FROM QuarryCurrentStage quarryCurrentStage";

	private static final String _SQL_SELECT_QUARRYCURRENTSTAGE_WHERE =
		"SELECT quarryCurrentStage FROM QuarryCurrentStage quarryCurrentStage WHERE ";

	private static final String _SQL_COUNT_QUARRYCURRENTSTAGE =
		"SELECT COUNT(quarryCurrentStage) FROM QuarryCurrentStage quarryCurrentStage";

	private static final String _SQL_COUNT_QUARRYCURRENTSTAGE_WHERE =
		"SELECT COUNT(quarryCurrentStage) FROM QuarryCurrentStage quarryCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "quarryCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QuarryCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QuarryCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuarryCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}