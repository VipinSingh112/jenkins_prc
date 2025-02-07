/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchSealedSourcesAddException;
import com.nbp.hsra.application.service.model.SealedSourcesAdd;
import com.nbp.hsra.application.service.model.SealedSourcesAddTable;
import com.nbp.hsra.application.service.model.impl.SealedSourcesAddImpl;
import com.nbp.hsra.application.service.model.impl.SealedSourcesAddModelImpl;
import com.nbp.hsra.application.service.service.persistence.SealedSourcesAddPersistence;
import com.nbp.hsra.application.service.service.persistence.SealedSourcesAddUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the sealed sources add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SealedSourcesAddPersistence.class)
public class SealedSourcesAddPersistenceImpl
	extends BasePersistenceImpl<SealedSourcesAdd>
	implements SealedSourcesAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SealedSourcesAddUtil</code> to access the sealed sources add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SealedSourcesAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetHsraById;
	private FinderPath _finderPathWithoutPaginationFindBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns all the sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching sealed sources adds
	 */
	@Override
	public List<SealedSourcesAdd> findBygetHsraById(long hsraApplicationId) {
		return findBygetHsraById(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @return the range of matching sealed sources adds
	 */
	@Override
	public List<SealedSourcesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return findBygetHsraById(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sealed sources adds
	 */
	@Override
	public List<SealedSourcesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<SealedSourcesAdd> orderByComparator) {

		return findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sealed sources adds
	 */
	@Override
	public List<SealedSourcesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<SealedSourcesAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHsraById;
				finderArgs = new Object[] {hsraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsraById;
			finderArgs = new Object[] {
				hsraApplicationId, start, end, orderByComparator
			};
		}

		List<SealedSourcesAdd> list = null;

		if (useFinderCache) {
			list = (List<SealedSourcesAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SealedSourcesAdd sealedSourcesAdd : list) {
					if (hsraApplicationId !=
							sealedSourcesAdd.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_SEALEDSOURCESADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SealedSourcesAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<SealedSourcesAdd>)QueryUtil.list(
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
	 * Returns the first sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sealed sources add
	 * @throws NoSuchSealedSourcesAddException if a matching sealed sources add could not be found
	 */
	@Override
	public SealedSourcesAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<SealedSourcesAdd> orderByComparator)
		throws NoSuchSealedSourcesAddException {

		SealedSourcesAdd sealedSourcesAdd = fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);

		if (sealedSourcesAdd != null) {
			return sealedSourcesAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchSealedSourcesAddException(sb.toString());
	}

	/**
	 * Returns the first sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sealed sources add, or <code>null</code> if a matching sealed sources add could not be found
	 */
	@Override
	public SealedSourcesAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<SealedSourcesAdd> orderByComparator) {

		List<SealedSourcesAdd> list = findBygetHsraById(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sealed sources add
	 * @throws NoSuchSealedSourcesAddException if a matching sealed sources add could not be found
	 */
	@Override
	public SealedSourcesAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<SealedSourcesAdd> orderByComparator)
		throws NoSuchSealedSourcesAddException {

		SealedSourcesAdd sealedSourcesAdd = fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);

		if (sealedSourcesAdd != null) {
			return sealedSourcesAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchSealedSourcesAddException(sb.toString());
	}

	/**
	 * Returns the last sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sealed sources add, or <code>null</code> if a matching sealed sources add could not be found
	 */
	@Override
	public SealedSourcesAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<SealedSourcesAdd> orderByComparator) {

		int count = countBygetHsraById(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<SealedSourcesAdd> list = findBygetHsraById(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sealed sources adds before and after the current sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param sealedSourcesAddId the primary key of the current sealed sources add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sealed sources add
	 * @throws NoSuchSealedSourcesAddException if a sealed sources add with the primary key could not be found
	 */
	@Override
	public SealedSourcesAdd[] findBygetHsraById_PrevAndNext(
			long sealedSourcesAddId, long hsraApplicationId,
			OrderByComparator<SealedSourcesAdd> orderByComparator)
		throws NoSuchSealedSourcesAddException {

		SealedSourcesAdd sealedSourcesAdd = findByPrimaryKey(
			sealedSourcesAddId);

		Session session = null;

		try {
			session = openSession();

			SealedSourcesAdd[] array = new SealedSourcesAddImpl[3];

			array[0] = getBygetHsraById_PrevAndNext(
				session, sealedSourcesAdd, hsraApplicationId, orderByComparator,
				true);

			array[1] = sealedSourcesAdd;

			array[2] = getBygetHsraById_PrevAndNext(
				session, sealedSourcesAdd, hsraApplicationId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected SealedSourcesAdd getBygetHsraById_PrevAndNext(
		Session session, SealedSourcesAdd sealedSourcesAdd,
		long hsraApplicationId,
		OrderByComparator<SealedSourcesAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_SEALEDSOURCESADD_WHERE);

		sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

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
			sb.append(SealedSourcesAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(hsraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sealedSourcesAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SealedSourcesAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sealed sources adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsraById(long hsraApplicationId) {
		for (SealedSourcesAdd sealedSourcesAdd :
				findBygetHsraById(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(sealedSourcesAdd);
		}
	}

	/**
	 * Returns the number of sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching sealed sources adds
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEALEDSOURCESADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"sealedSourcesAdd.hsraApplicationId = ?";

	public SealedSourcesAddPersistenceImpl() {
		setModelClass(SealedSourcesAdd.class);

		setModelImplClass(SealedSourcesAddImpl.class);
		setModelPKClass(long.class);

		setTable(SealedSourcesAddTable.INSTANCE);
	}

	/**
	 * Caches the sealed sources add in the entity cache if it is enabled.
	 *
	 * @param sealedSourcesAdd the sealed sources add
	 */
	@Override
	public void cacheResult(SealedSourcesAdd sealedSourcesAdd) {
		entityCache.putResult(
			SealedSourcesAddImpl.class, sealedSourcesAdd.getPrimaryKey(),
			sealedSourcesAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sealed sources adds in the entity cache if it is enabled.
	 *
	 * @param sealedSourcesAdds the sealed sources adds
	 */
	@Override
	public void cacheResult(List<SealedSourcesAdd> sealedSourcesAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sealedSourcesAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SealedSourcesAdd sealedSourcesAdd : sealedSourcesAdds) {
			if (entityCache.getResult(
					SealedSourcesAddImpl.class,
					sealedSourcesAdd.getPrimaryKey()) == null) {

				cacheResult(sealedSourcesAdd);
			}
		}
	}

	/**
	 * Clears the cache for all sealed sources adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SealedSourcesAddImpl.class);

		finderCache.clearCache(SealedSourcesAddImpl.class);
	}

	/**
	 * Clears the cache for the sealed sources add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SealedSourcesAdd sealedSourcesAdd) {
		entityCache.removeResult(SealedSourcesAddImpl.class, sealedSourcesAdd);
	}

	@Override
	public void clearCache(List<SealedSourcesAdd> sealedSourcesAdds) {
		for (SealedSourcesAdd sealedSourcesAdd : sealedSourcesAdds) {
			entityCache.removeResult(
				SealedSourcesAddImpl.class, sealedSourcesAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SealedSourcesAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SealedSourcesAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sealed sources add with the primary key. Does not add the sealed sources add to the database.
	 *
	 * @param sealedSourcesAddId the primary key for the new sealed sources add
	 * @return the new sealed sources add
	 */
	@Override
	public SealedSourcesAdd create(long sealedSourcesAddId) {
		SealedSourcesAdd sealedSourcesAdd = new SealedSourcesAddImpl();

		sealedSourcesAdd.setNew(true);
		sealedSourcesAdd.setPrimaryKey(sealedSourcesAddId);

		sealedSourcesAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sealedSourcesAdd;
	}

	/**
	 * Removes the sealed sources add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sealedSourcesAddId the primary key of the sealed sources add
	 * @return the sealed sources add that was removed
	 * @throws NoSuchSealedSourcesAddException if a sealed sources add with the primary key could not be found
	 */
	@Override
	public SealedSourcesAdd remove(long sealedSourcesAddId)
		throws NoSuchSealedSourcesAddException {

		return remove((Serializable)sealedSourcesAddId);
	}

	/**
	 * Removes the sealed sources add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sealed sources add
	 * @return the sealed sources add that was removed
	 * @throws NoSuchSealedSourcesAddException if a sealed sources add with the primary key could not be found
	 */
	@Override
	public SealedSourcesAdd remove(Serializable primaryKey)
		throws NoSuchSealedSourcesAddException {

		Session session = null;

		try {
			session = openSession();

			SealedSourcesAdd sealedSourcesAdd = (SealedSourcesAdd)session.get(
				SealedSourcesAddImpl.class, primaryKey);

			if (sealedSourcesAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSealedSourcesAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sealedSourcesAdd);
		}
		catch (NoSuchSealedSourcesAddException noSuchEntityException) {
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
	protected SealedSourcesAdd removeImpl(SealedSourcesAdd sealedSourcesAdd) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sealedSourcesAdd)) {
				sealedSourcesAdd = (SealedSourcesAdd)session.get(
					SealedSourcesAddImpl.class,
					sealedSourcesAdd.getPrimaryKeyObj());
			}

			if (sealedSourcesAdd != null) {
				session.delete(sealedSourcesAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sealedSourcesAdd != null) {
			clearCache(sealedSourcesAdd);
		}

		return sealedSourcesAdd;
	}

	@Override
	public SealedSourcesAdd updateImpl(SealedSourcesAdd sealedSourcesAdd) {
		boolean isNew = sealedSourcesAdd.isNew();

		if (!(sealedSourcesAdd instanceof SealedSourcesAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sealedSourcesAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sealedSourcesAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sealedSourcesAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SealedSourcesAdd implementation " +
					sealedSourcesAdd.getClass());
		}

		SealedSourcesAddModelImpl sealedSourcesAddModelImpl =
			(SealedSourcesAddModelImpl)sealedSourcesAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sealedSourcesAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				sealedSourcesAdd.setCreateDate(date);
			}
			else {
				sealedSourcesAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sealedSourcesAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sealedSourcesAdd.setModifiedDate(date);
			}
			else {
				sealedSourcesAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sealedSourcesAdd);
			}
			else {
				sealedSourcesAdd = (SealedSourcesAdd)session.merge(
					sealedSourcesAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SealedSourcesAddImpl.class, sealedSourcesAddModelImpl, false, true);

		if (isNew) {
			sealedSourcesAdd.setNew(false);
		}

		sealedSourcesAdd.resetOriginalValues();

		return sealedSourcesAdd;
	}

	/**
	 * Returns the sealed sources add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sealed sources add
	 * @return the sealed sources add
	 * @throws NoSuchSealedSourcesAddException if a sealed sources add with the primary key could not be found
	 */
	@Override
	public SealedSourcesAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSealedSourcesAddException {

		SealedSourcesAdd sealedSourcesAdd = fetchByPrimaryKey(primaryKey);

		if (sealedSourcesAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSealedSourcesAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sealedSourcesAdd;
	}

	/**
	 * Returns the sealed sources add with the primary key or throws a <code>NoSuchSealedSourcesAddException</code> if it could not be found.
	 *
	 * @param sealedSourcesAddId the primary key of the sealed sources add
	 * @return the sealed sources add
	 * @throws NoSuchSealedSourcesAddException if a sealed sources add with the primary key could not be found
	 */
	@Override
	public SealedSourcesAdd findByPrimaryKey(long sealedSourcesAddId)
		throws NoSuchSealedSourcesAddException {

		return findByPrimaryKey((Serializable)sealedSourcesAddId);
	}

	/**
	 * Returns the sealed sources add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sealedSourcesAddId the primary key of the sealed sources add
	 * @return the sealed sources add, or <code>null</code> if a sealed sources add with the primary key could not be found
	 */
	@Override
	public SealedSourcesAdd fetchByPrimaryKey(long sealedSourcesAddId) {
		return fetchByPrimaryKey((Serializable)sealedSourcesAddId);
	}

	/**
	 * Returns all the sealed sources adds.
	 *
	 * @return the sealed sources adds
	 */
	@Override
	public List<SealedSourcesAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sealed sources adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @return the range of sealed sources adds
	 */
	@Override
	public List<SealedSourcesAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sealed sources adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sealed sources adds
	 */
	@Override
	public List<SealedSourcesAdd> findAll(
		int start, int end,
		OrderByComparator<SealedSourcesAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sealed sources adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sealed sources adds
	 */
	@Override
	public List<SealedSourcesAdd> findAll(
		int start, int end,
		OrderByComparator<SealedSourcesAdd> orderByComparator,
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

		List<SealedSourcesAdd> list = null;

		if (useFinderCache) {
			list = (List<SealedSourcesAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEALEDSOURCESADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEALEDSOURCESADD;

				sql = sql.concat(SealedSourcesAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SealedSourcesAdd>)QueryUtil.list(
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
	 * Removes all the sealed sources adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SealedSourcesAdd sealedSourcesAdd : findAll()) {
			remove(sealedSourcesAdd);
		}
	}

	/**
	 * Returns the number of sealed sources adds.
	 *
	 * @return the number of sealed sources adds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SEALEDSOURCESADD);

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
		return "sealedSourcesAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEALEDSOURCESADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SealedSourcesAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sealed sources add persistence.
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

		_finderPathWithPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsraById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"hsraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		SealedSourcesAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SealedSourcesAddUtil.setPersistence(null);

		entityCache.removeCache(SealedSourcesAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEALEDSOURCESADD =
		"SELECT sealedSourcesAdd FROM SealedSourcesAdd sealedSourcesAdd";

	private static final String _SQL_SELECT_SEALEDSOURCESADD_WHERE =
		"SELECT sealedSourcesAdd FROM SealedSourcesAdd sealedSourcesAdd WHERE ";

	private static final String _SQL_COUNT_SEALEDSOURCESADD =
		"SELECT COUNT(sealedSourcesAdd) FROM SealedSourcesAdd sealedSourcesAdd";

	private static final String _SQL_COUNT_SEALEDSOURCESADD_WHERE =
		"SELECT COUNT(sealedSourcesAdd) FROM SealedSourcesAdd sealedSourcesAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sealedSourcesAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SealedSourcesAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SealedSourcesAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SealedSourcesAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}