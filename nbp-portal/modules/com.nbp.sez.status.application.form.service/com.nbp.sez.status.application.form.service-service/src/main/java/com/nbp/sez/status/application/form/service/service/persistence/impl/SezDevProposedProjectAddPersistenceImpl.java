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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevProposedProjectAddException;
import com.nbp.sez.status.application.form.service.model.SezDevProposedProjectAdd;
import com.nbp.sez.status.application.form.service.model.SezDevProposedProjectAddTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevProposedProjectAddImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevProposedProjectAddModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevProposedProjectAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevProposedProjectAddUtil;
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
 * The persistence implementation for the sez dev proposed project add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevProposedProjectAddPersistence.class)
public class SezDevProposedProjectAddPersistenceImpl
	extends BasePersistenceImpl<SezDevProposedProjectAdd>
	implements SezDevProposedProjectAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevProposedProjectAddUtil</code> to access the sez dev proposed project add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevProposedProjectAddImpl.class.getName();

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
	 * Returns all the sez dev proposed project adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev proposed project adds
	 */
	@Override
	public List<SezDevProposedProjectAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev proposed project adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev proposed project adds
	 * @param end the upper bound of the range of sez dev proposed project adds (not inclusive)
	 * @return the range of matching sez dev proposed project adds
	 */
	@Override
	public List<SezDevProposedProjectAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev proposed project adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev proposed project adds
	 * @param end the upper bound of the range of sez dev proposed project adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev proposed project adds
	 */
	@Override
	public List<SezDevProposedProjectAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevProposedProjectAdd> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev proposed project adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev proposed project adds
	 * @param end the upper bound of the range of sez dev proposed project adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev proposed project adds
	 */
	@Override
	public List<SezDevProposedProjectAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevProposedProjectAdd> orderByComparator,
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

		List<SezDevProposedProjectAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevProposedProjectAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezDevProposedProjectAdd sezDevProposedProjectAdd : list) {
					if (sezStatusApplicationId !=
							sezDevProposedProjectAdd.
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

			sb.append(_SQL_SELECT_SEZDEVPROPOSEDPROJECTADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezDevProposedProjectAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezDevProposedProjectAdd>)QueryUtil.list(
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
	 * Returns the first sez dev proposed project add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev proposed project add
	 * @throws NoSuchSezDevProposedProjectAddException if a matching sez dev proposed project add could not be found
	 */
	@Override
	public SezDevProposedProjectAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevProposedProjectAdd> orderByComparator)
		throws NoSuchSezDevProposedProjectAddException {

		SezDevProposedProjectAdd sezDevProposedProjectAdd =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezDevProposedProjectAdd != null) {
			return sezDevProposedProjectAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevProposedProjectAddException(sb.toString());
	}

	/**
	 * Returns the first sez dev proposed project add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev proposed project add, or <code>null</code> if a matching sez dev proposed project add could not be found
	 */
	@Override
	public SezDevProposedProjectAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevProposedProjectAdd> orderByComparator) {

		List<SezDevProposedProjectAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez dev proposed project add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev proposed project add
	 * @throws NoSuchSezDevProposedProjectAddException if a matching sez dev proposed project add could not be found
	 */
	@Override
	public SezDevProposedProjectAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevProposedProjectAdd> orderByComparator)
		throws NoSuchSezDevProposedProjectAddException {

		SezDevProposedProjectAdd sezDevProposedProjectAdd =
			fetchBygetSezStatusByAppId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezDevProposedProjectAdd != null) {
			return sezDevProposedProjectAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevProposedProjectAddException(sb.toString());
	}

	/**
	 * Returns the last sez dev proposed project add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev proposed project add, or <code>null</code> if a matching sez dev proposed project add could not be found
	 */
	@Override
	public SezDevProposedProjectAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevProposedProjectAdd> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezDevProposedProjectAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez dev proposed project adds before and after the current sez dev proposed project add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevProposedProjectAddId the primary key of the current sez dev proposed project add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev proposed project add
	 * @throws NoSuchSezDevProposedProjectAddException if a sez dev proposed project add with the primary key could not be found
	 */
	@Override
	public SezDevProposedProjectAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevProposedProjectAddId, long sezStatusApplicationId,
			OrderByComparator<SezDevProposedProjectAdd> orderByComparator)
		throws NoSuchSezDevProposedProjectAddException {

		SezDevProposedProjectAdd sezDevProposedProjectAdd = findByPrimaryKey(
			sezDevProposedProjectAddId);

		Session session = null;

		try {
			session = openSession();

			SezDevProposedProjectAdd[] array =
				new SezDevProposedProjectAddImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevProposedProjectAdd, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezDevProposedProjectAdd;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevProposedProjectAdd, sezStatusApplicationId,
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

	protected SezDevProposedProjectAdd getBygetSezStatusByAppId_PrevAndNext(
		Session session, SezDevProposedProjectAdd sezDevProposedProjectAdd,
		long sezStatusApplicationId,
		OrderByComparator<SezDevProposedProjectAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZDEVPROPOSEDPROJECTADD_WHERE);

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
			sb.append(SezDevProposedProjectAddModelImpl.ORDER_BY_JPQL);
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
						sezDevProposedProjectAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezDevProposedProjectAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez dev proposed project adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezDevProposedProjectAdd sezDevProposedProjectAdd :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezDevProposedProjectAdd);
		}
	}

	/**
	 * Returns the number of sez dev proposed project adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev proposed project adds
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVPROPOSEDPROJECTADD_WHERE);

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
			"sezDevProposedProjectAdd.sezStatusApplicationId = ?";

	public SezDevProposedProjectAddPersistenceImpl() {
		setModelClass(SezDevProposedProjectAdd.class);

		setModelImplClass(SezDevProposedProjectAddImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevProposedProjectAddTable.INSTANCE);
	}

	/**
	 * Caches the sez dev proposed project add in the entity cache if it is enabled.
	 *
	 * @param sezDevProposedProjectAdd the sez dev proposed project add
	 */
	@Override
	public void cacheResult(SezDevProposedProjectAdd sezDevProposedProjectAdd) {
		entityCache.putResult(
			SezDevProposedProjectAddImpl.class,
			sezDevProposedProjectAdd.getPrimaryKey(), sezDevProposedProjectAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev proposed project adds in the entity cache if it is enabled.
	 *
	 * @param sezDevProposedProjectAdds the sez dev proposed project adds
	 */
	@Override
	public void cacheResult(
		List<SezDevProposedProjectAdd> sezDevProposedProjectAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevProposedProjectAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevProposedProjectAdd sezDevProposedProjectAdd :
				sezDevProposedProjectAdds) {

			if (entityCache.getResult(
					SezDevProposedProjectAddImpl.class,
					sezDevProposedProjectAdd.getPrimaryKey()) == null) {

				cacheResult(sezDevProposedProjectAdd);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev proposed project adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevProposedProjectAddImpl.class);

		finderCache.clearCache(SezDevProposedProjectAddImpl.class);
	}

	/**
	 * Clears the cache for the sez dev proposed project add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezDevProposedProjectAdd sezDevProposedProjectAdd) {
		entityCache.removeResult(
			SezDevProposedProjectAddImpl.class, sezDevProposedProjectAdd);
	}

	@Override
	public void clearCache(
		List<SezDevProposedProjectAdd> sezDevProposedProjectAdds) {

		for (SezDevProposedProjectAdd sezDevProposedProjectAdd :
				sezDevProposedProjectAdds) {

			entityCache.removeResult(
				SezDevProposedProjectAddImpl.class, sezDevProposedProjectAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevProposedProjectAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevProposedProjectAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez dev proposed project add with the primary key. Does not add the sez dev proposed project add to the database.
	 *
	 * @param sezDevProposedProjectAddId the primary key for the new sez dev proposed project add
	 * @return the new sez dev proposed project add
	 */
	@Override
	public SezDevProposedProjectAdd create(long sezDevProposedProjectAddId) {
		SezDevProposedProjectAdd sezDevProposedProjectAdd =
			new SezDevProposedProjectAddImpl();

		sezDevProposedProjectAdd.setNew(true);
		sezDevProposedProjectAdd.setPrimaryKey(sezDevProposedProjectAddId);

		sezDevProposedProjectAdd.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezDevProposedProjectAdd;
	}

	/**
	 * Removes the sez dev proposed project add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevProposedProjectAddId the primary key of the sez dev proposed project add
	 * @return the sez dev proposed project add that was removed
	 * @throws NoSuchSezDevProposedProjectAddException if a sez dev proposed project add with the primary key could not be found
	 */
	@Override
	public SezDevProposedProjectAdd remove(long sezDevProposedProjectAddId)
		throws NoSuchSezDevProposedProjectAddException {

		return remove((Serializable)sezDevProposedProjectAddId);
	}

	/**
	 * Removes the sez dev proposed project add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev proposed project add
	 * @return the sez dev proposed project add that was removed
	 * @throws NoSuchSezDevProposedProjectAddException if a sez dev proposed project add with the primary key could not be found
	 */
	@Override
	public SezDevProposedProjectAdd remove(Serializable primaryKey)
		throws NoSuchSezDevProposedProjectAddException {

		Session session = null;

		try {
			session = openSession();

			SezDevProposedProjectAdd sezDevProposedProjectAdd =
				(SezDevProposedProjectAdd)session.get(
					SezDevProposedProjectAddImpl.class, primaryKey);

			if (sezDevProposedProjectAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevProposedProjectAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevProposedProjectAdd);
		}
		catch (NoSuchSezDevProposedProjectAddException noSuchEntityException) {
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
	protected SezDevProposedProjectAdd removeImpl(
		SezDevProposedProjectAdd sezDevProposedProjectAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevProposedProjectAdd)) {
				sezDevProposedProjectAdd =
					(SezDevProposedProjectAdd)session.get(
						SezDevProposedProjectAddImpl.class,
						sezDevProposedProjectAdd.getPrimaryKeyObj());
			}

			if (sezDevProposedProjectAdd != null) {
				session.delete(sezDevProposedProjectAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevProposedProjectAdd != null) {
			clearCache(sezDevProposedProjectAdd);
		}

		return sezDevProposedProjectAdd;
	}

	@Override
	public SezDevProposedProjectAdd updateImpl(
		SezDevProposedProjectAdd sezDevProposedProjectAdd) {

		boolean isNew = sezDevProposedProjectAdd.isNew();

		if (!(sezDevProposedProjectAdd instanceof
				SezDevProposedProjectAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezDevProposedProjectAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevProposedProjectAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevProposedProjectAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevProposedProjectAdd implementation " +
					sezDevProposedProjectAdd.getClass());
		}

		SezDevProposedProjectAddModelImpl sezDevProposedProjectAddModelImpl =
			(SezDevProposedProjectAddModelImpl)sezDevProposedProjectAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevProposedProjectAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevProposedProjectAdd.setCreateDate(date);
			}
			else {
				sezDevProposedProjectAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevProposedProjectAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevProposedProjectAdd.setModifiedDate(date);
			}
			else {
				sezDevProposedProjectAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevProposedProjectAdd);
			}
			else {
				sezDevProposedProjectAdd =
					(SezDevProposedProjectAdd)session.merge(
						sezDevProposedProjectAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevProposedProjectAddImpl.class,
			sezDevProposedProjectAddModelImpl, false, true);

		if (isNew) {
			sezDevProposedProjectAdd.setNew(false);
		}

		sezDevProposedProjectAdd.resetOriginalValues();

		return sezDevProposedProjectAdd;
	}

	/**
	 * Returns the sez dev proposed project add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev proposed project add
	 * @return the sez dev proposed project add
	 * @throws NoSuchSezDevProposedProjectAddException if a sez dev proposed project add with the primary key could not be found
	 */
	@Override
	public SezDevProposedProjectAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDevProposedProjectAddException {

		SezDevProposedProjectAdd sezDevProposedProjectAdd = fetchByPrimaryKey(
			primaryKey);

		if (sezDevProposedProjectAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevProposedProjectAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevProposedProjectAdd;
	}

	/**
	 * Returns the sez dev proposed project add with the primary key or throws a <code>NoSuchSezDevProposedProjectAddException</code> if it could not be found.
	 *
	 * @param sezDevProposedProjectAddId the primary key of the sez dev proposed project add
	 * @return the sez dev proposed project add
	 * @throws NoSuchSezDevProposedProjectAddException if a sez dev proposed project add with the primary key could not be found
	 */
	@Override
	public SezDevProposedProjectAdd findByPrimaryKey(
			long sezDevProposedProjectAddId)
		throws NoSuchSezDevProposedProjectAddException {

		return findByPrimaryKey((Serializable)sezDevProposedProjectAddId);
	}

	/**
	 * Returns the sez dev proposed project add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevProposedProjectAddId the primary key of the sez dev proposed project add
	 * @return the sez dev proposed project add, or <code>null</code> if a sez dev proposed project add with the primary key could not be found
	 */
	@Override
	public SezDevProposedProjectAdd fetchByPrimaryKey(
		long sezDevProposedProjectAddId) {

		return fetchByPrimaryKey((Serializable)sezDevProposedProjectAddId);
	}

	/**
	 * Returns all the sez dev proposed project adds.
	 *
	 * @return the sez dev proposed project adds
	 */
	@Override
	public List<SezDevProposedProjectAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev proposed project adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed project adds
	 * @param end the upper bound of the range of sez dev proposed project adds (not inclusive)
	 * @return the range of sez dev proposed project adds
	 */
	@Override
	public List<SezDevProposedProjectAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev proposed project adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed project adds
	 * @param end the upper bound of the range of sez dev proposed project adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev proposed project adds
	 */
	@Override
	public List<SezDevProposedProjectAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevProposedProjectAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev proposed project adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed project adds
	 * @param end the upper bound of the range of sez dev proposed project adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev proposed project adds
	 */
	@Override
	public List<SezDevProposedProjectAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevProposedProjectAdd> orderByComparator,
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

		List<SezDevProposedProjectAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevProposedProjectAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVPROPOSEDPROJECTADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVPROPOSEDPROJECTADD;

				sql = sql.concat(
					SezDevProposedProjectAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevProposedProjectAdd>)QueryUtil.list(
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
	 * Removes all the sez dev proposed project adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevProposedProjectAdd sezDevProposedProjectAdd : findAll()) {
			remove(sezDevProposedProjectAdd);
		}
	}

	/**
	 * Returns the number of sez dev proposed project adds.
	 *
	 * @return the number of sez dev proposed project adds
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
					_SQL_COUNT_SEZDEVPROPOSEDPROJECTADD);

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
		return "sezDevProposedProjectAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVPROPOSEDPROJECTADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevProposedProjectAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev proposed project add persistence.
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

		SezDevProposedProjectAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevProposedProjectAddUtil.setPersistence(null);

		entityCache.removeCache(SezDevProposedProjectAddImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZDEVPROPOSEDPROJECTADD =
		"SELECT sezDevProposedProjectAdd FROM SezDevProposedProjectAdd sezDevProposedProjectAdd";

	private static final String _SQL_SELECT_SEZDEVPROPOSEDPROJECTADD_WHERE =
		"SELECT sezDevProposedProjectAdd FROM SezDevProposedProjectAdd sezDevProposedProjectAdd WHERE ";

	private static final String _SQL_COUNT_SEZDEVPROPOSEDPROJECTADD =
		"SELECT COUNT(sezDevProposedProjectAdd) FROM SezDevProposedProjectAdd sezDevProposedProjectAdd";

	private static final String _SQL_COUNT_SEZDEVPROPOSEDPROJECTADD_WHERE =
		"SELECT COUNT(sezDevProposedProjectAdd) FROM SezDevProposedProjectAdd sezDevProposedProjectAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevProposedProjectAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevProposedProjectAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevProposedProjectAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevProposedProjectAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}