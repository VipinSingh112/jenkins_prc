/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantPrincipleDirectorException;
import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleDirector;
import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleDirectorTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantPrincipleDirectorImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantPrincipleDirectorModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantPrincipleDirectorPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantPrincipleDirectorUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the sez occupant principle director service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezOccupantPrincipleDirectorPersistence.class)
public class SezOccupantPrincipleDirectorPersistenceImpl
	extends BasePersistenceImpl<SezOccupantPrincipleDirector>
	implements SezOccupantPrincipleDirectorPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezOccupantPrincipleDirectorUtil</code> to access the sez occupant principle director persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezOccupantPrincipleDirectorImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns all the sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant principle directors
	 */
	@Override
	public List<SezOccupantPrincipleDirector> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @return the range of matching sez occupant principle directors
	 */
	@Override
	public List<SezOccupantPrincipleDirector> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant principle directors
	 */
	@Override
	public List<SezOccupantPrincipleDirector> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantPrincipleDirector> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant principle directors
	 */
	@Override
	public List<SezOccupantPrincipleDirector> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantPrincipleDirector> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetSezStatusByAppId;
				finderArgs = new Object[] {sezStatusApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSezStatusByAppId;
			finderArgs = new Object[] {
				sezStatusApplicationId, start, end, orderByComparator
			};
		}

		List<SezOccupantPrincipleDirector> list = null;

		if (useFinderCache) {
			list = (List<SezOccupantPrincipleDirector>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezOccupantPrincipleDirector sezOccupantPrincipleDirector :
						list) {

					if (sezStatusApplicationId !=
							sezOccupantPrincipleDirector.
								getSezStatusApplicationId()) {

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

			sb.append(_SQL_SELECT_SEZOCCUPANTPRINCIPLEDIRECTOR_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezOccupantPrincipleDirectorModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezOccupantPrincipleDirector>)QueryUtil.list(
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
	 * Returns the first sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant principle director
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a matching sez occupant principle director could not be found
	 */
	@Override
	public SezOccupantPrincipleDirector findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantPrincipleDirector> orderByComparator)
		throws NoSuchSezOccupantPrincipleDirectorException {

		SezOccupantPrincipleDirector sezOccupantPrincipleDirector =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezOccupantPrincipleDirector != null) {
			return sezOccupantPrincipleDirector;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezOccupantPrincipleDirectorException(sb.toString());
	}

	/**
	 * Returns the first sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant principle director, or <code>null</code> if a matching sez occupant principle director could not be found
	 */
	@Override
	public SezOccupantPrincipleDirector fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantPrincipleDirector> orderByComparator) {

		List<SezOccupantPrincipleDirector> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant principle director
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a matching sez occupant principle director could not be found
	 */
	@Override
	public SezOccupantPrincipleDirector findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantPrincipleDirector> orderByComparator)
		throws NoSuchSezOccupantPrincipleDirectorException {

		SezOccupantPrincipleDirector sezOccupantPrincipleDirector =
			fetchBygetSezStatusByAppId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezOccupantPrincipleDirector != null) {
			return sezOccupantPrincipleDirector;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezOccupantPrincipleDirectorException(sb.toString());
	}

	/**
	 * Returns the last sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant principle director, or <code>null</code> if a matching sez occupant principle director could not be found
	 */
	@Override
	public SezOccupantPrincipleDirector fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantPrincipleDirector> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezOccupantPrincipleDirector> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez occupant principle directors before and after the current sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccPrincDirectId the primary key of the current sez occupant principle director
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant principle director
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a sez occupant principle director with the primary key could not be found
	 */
	@Override
	public SezOccupantPrincipleDirector[] findBygetSezStatusByAppId_PrevAndNext(
			long sezOccPrincDirectId, long sezStatusApplicationId,
			OrderByComparator<SezOccupantPrincipleDirector> orderByComparator)
		throws NoSuchSezOccupantPrincipleDirectorException {

		SezOccupantPrincipleDirector sezOccupantPrincipleDirector =
			findByPrimaryKey(sezOccPrincDirectId);

		Session session = null;

		try {
			session = openSession();

			SezOccupantPrincipleDirector[] array =
				new SezOccupantPrincipleDirectorImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezOccupantPrincipleDirector, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezOccupantPrincipleDirector;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezOccupantPrincipleDirector, sezStatusApplicationId,
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

	protected SezOccupantPrincipleDirector getBygetSezStatusByAppId_PrevAndNext(
		Session session,
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector,
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantPrincipleDirector> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZOCCUPANTPRINCIPLEDIRECTOR_WHERE);

		sb.append(_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

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
			sb.append(SezOccupantPrincipleDirectorModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(sezStatusApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sezOccupantPrincipleDirector)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezOccupantPrincipleDirector> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez occupant principle directors where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezOccupantPrincipleDirector sezOccupantPrincipleDirector :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezOccupantPrincipleDirector);
		}
	}

	/**
	 * Returns the number of sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant principle directors
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZOCCUPANTPRINCIPLEDIRECTOR_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezOccupantPrincipleDirector.sezStatusApplicationId = ?";

	public SezOccupantPrincipleDirectorPersistenceImpl() {
		setModelClass(SezOccupantPrincipleDirector.class);

		setModelImplClass(SezOccupantPrincipleDirectorImpl.class);
		setModelPKClass(long.class);

		setTable(SezOccupantPrincipleDirectorTable.INSTANCE);
	}

	/**
	 * Caches the sez occupant principle director in the entity cache if it is enabled.
	 *
	 * @param sezOccupantPrincipleDirector the sez occupant principle director
	 */
	@Override
	public void cacheResult(
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector) {

		entityCache.putResult(
			SezOccupantPrincipleDirectorImpl.class,
			sezOccupantPrincipleDirector.getPrimaryKey(),
			sezOccupantPrincipleDirector);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez occupant principle directors in the entity cache if it is enabled.
	 *
	 * @param sezOccupantPrincipleDirectors the sez occupant principle directors
	 */
	@Override
	public void cacheResult(
		List<SezOccupantPrincipleDirector> sezOccupantPrincipleDirectors) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezOccupantPrincipleDirectors.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezOccupantPrincipleDirector sezOccupantPrincipleDirector :
				sezOccupantPrincipleDirectors) {

			if (entityCache.getResult(
					SezOccupantPrincipleDirectorImpl.class,
					sezOccupantPrincipleDirector.getPrimaryKey()) == null) {

				cacheResult(sezOccupantPrincipleDirector);
			}
		}
	}

	/**
	 * Clears the cache for all sez occupant principle directors.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezOccupantPrincipleDirectorImpl.class);

		finderCache.clearCache(SezOccupantPrincipleDirectorImpl.class);
	}

	/**
	 * Clears the cache for the sez occupant principle director.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector) {

		entityCache.removeResult(
			SezOccupantPrincipleDirectorImpl.class,
			sezOccupantPrincipleDirector);
	}

	@Override
	public void clearCache(
		List<SezOccupantPrincipleDirector> sezOccupantPrincipleDirectors) {

		for (SezOccupantPrincipleDirector sezOccupantPrincipleDirector :
				sezOccupantPrincipleDirectors) {

			entityCache.removeResult(
				SezOccupantPrincipleDirectorImpl.class,
				sezOccupantPrincipleDirector);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezOccupantPrincipleDirectorImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezOccupantPrincipleDirectorImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez occupant principle director with the primary key. Does not add the sez occupant principle director to the database.
	 *
	 * @param sezOccPrincDirectId the primary key for the new sez occupant principle director
	 * @return the new sez occupant principle director
	 */
	@Override
	public SezOccupantPrincipleDirector create(long sezOccPrincDirectId) {
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector =
			new SezOccupantPrincipleDirectorImpl();

		sezOccupantPrincipleDirector.setNew(true);
		sezOccupantPrincipleDirector.setPrimaryKey(sezOccPrincDirectId);

		sezOccupantPrincipleDirector.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezOccupantPrincipleDirector;
	}

	/**
	 * Removes the sez occupant principle director with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccPrincDirectId the primary key of the sez occupant principle director
	 * @return the sez occupant principle director that was removed
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a sez occupant principle director with the primary key could not be found
	 */
	@Override
	public SezOccupantPrincipleDirector remove(long sezOccPrincDirectId)
		throws NoSuchSezOccupantPrincipleDirectorException {

		return remove((Serializable)sezOccPrincDirectId);
	}

	/**
	 * Removes the sez occupant principle director with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez occupant principle director
	 * @return the sez occupant principle director that was removed
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a sez occupant principle director with the primary key could not be found
	 */
	@Override
	public SezOccupantPrincipleDirector remove(Serializable primaryKey)
		throws NoSuchSezOccupantPrincipleDirectorException {

		Session session = null;

		try {
			session = openSession();

			SezOccupantPrincipleDirector sezOccupantPrincipleDirector =
				(SezOccupantPrincipleDirector)session.get(
					SezOccupantPrincipleDirectorImpl.class, primaryKey);

			if (sezOccupantPrincipleDirector == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezOccupantPrincipleDirectorException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezOccupantPrincipleDirector);
		}
		catch (NoSuchSezOccupantPrincipleDirectorException
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
	protected SezOccupantPrincipleDirector removeImpl(
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezOccupantPrincipleDirector)) {
				sezOccupantPrincipleDirector =
					(SezOccupantPrincipleDirector)session.get(
						SezOccupantPrincipleDirectorImpl.class,
						sezOccupantPrincipleDirector.getPrimaryKeyObj());
			}

			if (sezOccupantPrincipleDirector != null) {
				session.delete(sezOccupantPrincipleDirector);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezOccupantPrincipleDirector != null) {
			clearCache(sezOccupantPrincipleDirector);
		}

		return sezOccupantPrincipleDirector;
	}

	@Override
	public SezOccupantPrincipleDirector updateImpl(
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector) {

		boolean isNew = sezOccupantPrincipleDirector.isNew();

		if (!(sezOccupantPrincipleDirector instanceof
				SezOccupantPrincipleDirectorModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezOccupantPrincipleDirector.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezOccupantPrincipleDirector);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezOccupantPrincipleDirector proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezOccupantPrincipleDirector implementation " +
					sezOccupantPrincipleDirector.getClass());
		}

		SezOccupantPrincipleDirectorModelImpl
			sezOccupantPrincipleDirectorModelImpl =
				(SezOccupantPrincipleDirectorModelImpl)
					sezOccupantPrincipleDirector;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezOccupantPrincipleDirector.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezOccupantPrincipleDirector.setCreateDate(date);
			}
			else {
				sezOccupantPrincipleDirector.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezOccupantPrincipleDirectorModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezOccupantPrincipleDirector.setModifiedDate(date);
			}
			else {
				sezOccupantPrincipleDirector.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezOccupantPrincipleDirector);
			}
			else {
				sezOccupantPrincipleDirector =
					(SezOccupantPrincipleDirector)session.merge(
						sezOccupantPrincipleDirector);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezOccupantPrincipleDirectorImpl.class,
			sezOccupantPrincipleDirectorModelImpl, false, true);

		if (isNew) {
			sezOccupantPrincipleDirector.setNew(false);
		}

		sezOccupantPrincipleDirector.resetOriginalValues();

		return sezOccupantPrincipleDirector;
	}

	/**
	 * Returns the sez occupant principle director with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez occupant principle director
	 * @return the sez occupant principle director
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a sez occupant principle director with the primary key could not be found
	 */
	@Override
	public SezOccupantPrincipleDirector findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezOccupantPrincipleDirectorException {

		SezOccupantPrincipleDirector sezOccupantPrincipleDirector =
			fetchByPrimaryKey(primaryKey);

		if (sezOccupantPrincipleDirector == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezOccupantPrincipleDirectorException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezOccupantPrincipleDirector;
	}

	/**
	 * Returns the sez occupant principle director with the primary key or throws a <code>NoSuchSezOccupantPrincipleDirectorException</code> if it could not be found.
	 *
	 * @param sezOccPrincDirectId the primary key of the sez occupant principle director
	 * @return the sez occupant principle director
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a sez occupant principle director with the primary key could not be found
	 */
	@Override
	public SezOccupantPrincipleDirector findByPrimaryKey(
			long sezOccPrincDirectId)
		throws NoSuchSezOccupantPrincipleDirectorException {

		return findByPrimaryKey((Serializable)sezOccPrincDirectId);
	}

	/**
	 * Returns the sez occupant principle director with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccPrincDirectId the primary key of the sez occupant principle director
	 * @return the sez occupant principle director, or <code>null</code> if a sez occupant principle director with the primary key could not be found
	 */
	@Override
	public SezOccupantPrincipleDirector fetchByPrimaryKey(
		long sezOccPrincDirectId) {

		return fetchByPrimaryKey((Serializable)sezOccPrincDirectId);
	}

	/**
	 * Returns all the sez occupant principle directors.
	 *
	 * @return the sez occupant principle directors
	 */
	@Override
	public List<SezOccupantPrincipleDirector> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant principle directors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @return the range of sez occupant principle directors
	 */
	@Override
	public List<SezOccupantPrincipleDirector> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle directors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant principle directors
	 */
	@Override
	public List<SezOccupantPrincipleDirector> findAll(
		int start, int end,
		OrderByComparator<SezOccupantPrincipleDirector> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle directors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant principle directors
	 */
	@Override
	public List<SezOccupantPrincipleDirector> findAll(
		int start, int end,
		OrderByComparator<SezOccupantPrincipleDirector> orderByComparator,
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

		List<SezOccupantPrincipleDirector> list = null;

		if (useFinderCache) {
			list = (List<SezOccupantPrincipleDirector>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZOCCUPANTPRINCIPLEDIRECTOR);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZOCCUPANTPRINCIPLEDIRECTOR;

				sql = sql.concat(
					SezOccupantPrincipleDirectorModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezOccupantPrincipleDirector>)QueryUtil.list(
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
	 * Removes all the sez occupant principle directors from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezOccupantPrincipleDirector sezOccupantPrincipleDirector :
				findAll()) {

			remove(sezOccupantPrincipleDirector);
		}
	}

	/**
	 * Returns the number of sez occupant principle directors.
	 *
	 * @return the number of sez occupant principle directors
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
					_SQL_COUNT_SEZOCCUPANTPRINCIPLEDIRECTOR);

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
		return "sezOccPrincDirectId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZOCCUPANTPRINCIPLEDIRECTOR;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezOccupantPrincipleDirectorModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez occupant principle director persistence.
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

		_finderPathWithPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSezStatusByAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezOccupantPrincipleDirectorUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezOccupantPrincipleDirectorUtil.setPersistence(null);

		entityCache.removeCache(
			SezOccupantPrincipleDirectorImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZOCCUPANTPRINCIPLEDIRECTOR =
		"SELECT sezOccupantPrincipleDirector FROM SezOccupantPrincipleDirector sezOccupantPrincipleDirector";

	private static final String _SQL_SELECT_SEZOCCUPANTPRINCIPLEDIRECTOR_WHERE =
		"SELECT sezOccupantPrincipleDirector FROM SezOccupantPrincipleDirector sezOccupantPrincipleDirector WHERE ";

	private static final String _SQL_COUNT_SEZOCCUPANTPRINCIPLEDIRECTOR =
		"SELECT COUNT(sezOccupantPrincipleDirector) FROM SezOccupantPrincipleDirector sezOccupantPrincipleDirector";

	private static final String _SQL_COUNT_SEZOCCUPANTPRINCIPLEDIRECTOR_WHERE =
		"SELECT COUNT(sezOccupantPrincipleDirector) FROM SezOccupantPrincipleDirector sezOccupantPrincipleDirector WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezOccupantPrincipleDirector.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezOccupantPrincipleDirector exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezOccupantPrincipleDirector exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezOccupantPrincipleDirectorPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}