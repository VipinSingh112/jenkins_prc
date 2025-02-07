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

import com.nbp.hsra.application.service.exception.NoSuchQualifedExpertAddException;
import com.nbp.hsra.application.service.model.QualifedExpertAdd;
import com.nbp.hsra.application.service.model.QualifedExpertAddTable;
import com.nbp.hsra.application.service.model.impl.QualifedExpertAddImpl;
import com.nbp.hsra.application.service.model.impl.QualifedExpertAddModelImpl;
import com.nbp.hsra.application.service.service.persistence.QualifedExpertAddPersistence;
import com.nbp.hsra.application.service.service.persistence.QualifedExpertAddUtil;
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
 * The persistence implementation for the qualifed expert add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QualifedExpertAddPersistence.class)
public class QualifedExpertAddPersistenceImpl
	extends BasePersistenceImpl<QualifedExpertAdd>
	implements QualifedExpertAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QualifedExpertAddUtil</code> to access the qualifed expert add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QualifedExpertAddImpl.class.getName();

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
	 * Returns all the qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching qualifed expert adds
	 */
	@Override
	public List<QualifedExpertAdd> findBygetHsraById(long hsraApplicationId) {
		return findBygetHsraById(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @return the range of matching qualifed expert adds
	 */
	@Override
	public List<QualifedExpertAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return findBygetHsraById(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qualifed expert adds
	 */
	@Override
	public List<QualifedExpertAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<QualifedExpertAdd> orderByComparator) {

		return findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching qualifed expert adds
	 */
	@Override
	public List<QualifedExpertAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<QualifedExpertAdd> orderByComparator,
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

		List<QualifedExpertAdd> list = null;

		if (useFinderCache) {
			list = (List<QualifedExpertAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QualifedExpertAdd qualifedExpertAdd : list) {
					if (hsraApplicationId !=
							qualifedExpertAdd.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_QUALIFEDEXPERTADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QualifedExpertAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<QualifedExpertAdd>)QueryUtil.list(
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
	 * Returns the first qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualifed expert add
	 * @throws NoSuchQualifedExpertAddException if a matching qualifed expert add could not be found
	 */
	@Override
	public QualifedExpertAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<QualifedExpertAdd> orderByComparator)
		throws NoSuchQualifedExpertAddException {

		QualifedExpertAdd qualifedExpertAdd = fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);

		if (qualifedExpertAdd != null) {
			return qualifedExpertAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchQualifedExpertAddException(sb.toString());
	}

	/**
	 * Returns the first qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualifed expert add, or <code>null</code> if a matching qualifed expert add could not be found
	 */
	@Override
	public QualifedExpertAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<QualifedExpertAdd> orderByComparator) {

		List<QualifedExpertAdd> list = findBygetHsraById(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualifed expert add
	 * @throws NoSuchQualifedExpertAddException if a matching qualifed expert add could not be found
	 */
	@Override
	public QualifedExpertAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<QualifedExpertAdd> orderByComparator)
		throws NoSuchQualifedExpertAddException {

		QualifedExpertAdd qualifedExpertAdd = fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);

		if (qualifedExpertAdd != null) {
			return qualifedExpertAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchQualifedExpertAddException(sb.toString());
	}

	/**
	 * Returns the last qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualifed expert add, or <code>null</code> if a matching qualifed expert add could not be found
	 */
	@Override
	public QualifedExpertAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<QualifedExpertAdd> orderByComparator) {

		int count = countBygetHsraById(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<QualifedExpertAdd> list = findBygetHsraById(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qualifed expert adds before and after the current qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param qualifedExpertAddId the primary key of the current qualifed expert add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qualifed expert add
	 * @throws NoSuchQualifedExpertAddException if a qualifed expert add with the primary key could not be found
	 */
	@Override
	public QualifedExpertAdd[] findBygetHsraById_PrevAndNext(
			long qualifedExpertAddId, long hsraApplicationId,
			OrderByComparator<QualifedExpertAdd> orderByComparator)
		throws NoSuchQualifedExpertAddException {

		QualifedExpertAdd qualifedExpertAdd = findByPrimaryKey(
			qualifedExpertAddId);

		Session session = null;

		try {
			session = openSession();

			QualifedExpertAdd[] array = new QualifedExpertAddImpl[3];

			array[0] = getBygetHsraById_PrevAndNext(
				session, qualifedExpertAdd, hsraApplicationId,
				orderByComparator, true);

			array[1] = qualifedExpertAdd;

			array[2] = getBygetHsraById_PrevAndNext(
				session, qualifedExpertAdd, hsraApplicationId,
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

	protected QualifedExpertAdd getBygetHsraById_PrevAndNext(
		Session session, QualifedExpertAdd qualifedExpertAdd,
		long hsraApplicationId,
		OrderByComparator<QualifedExpertAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_QUALIFEDEXPERTADD_WHERE);

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
			sb.append(QualifedExpertAddModelImpl.ORDER_BY_JPQL);
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
						qualifedExpertAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QualifedExpertAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qualifed expert adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsraById(long hsraApplicationId) {
		for (QualifedExpertAdd qualifedExpertAdd :
				findBygetHsraById(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(qualifedExpertAdd);
		}
	}

	/**
	 * Returns the number of qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching qualifed expert adds
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUALIFEDEXPERTADD_WHERE);

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
		"qualifedExpertAdd.hsraApplicationId = ?";

	public QualifedExpertAddPersistenceImpl() {
		setModelClass(QualifedExpertAdd.class);

		setModelImplClass(QualifedExpertAddImpl.class);
		setModelPKClass(long.class);

		setTable(QualifedExpertAddTable.INSTANCE);
	}

	/**
	 * Caches the qualifed expert add in the entity cache if it is enabled.
	 *
	 * @param qualifedExpertAdd the qualifed expert add
	 */
	@Override
	public void cacheResult(QualifedExpertAdd qualifedExpertAdd) {
		entityCache.putResult(
			QualifedExpertAddImpl.class, qualifedExpertAdd.getPrimaryKey(),
			qualifedExpertAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the qualifed expert adds in the entity cache if it is enabled.
	 *
	 * @param qualifedExpertAdds the qualifed expert adds
	 */
	@Override
	public void cacheResult(List<QualifedExpertAdd> qualifedExpertAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (qualifedExpertAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QualifedExpertAdd qualifedExpertAdd : qualifedExpertAdds) {
			if (entityCache.getResult(
					QualifedExpertAddImpl.class,
					qualifedExpertAdd.getPrimaryKey()) == null) {

				cacheResult(qualifedExpertAdd);
			}
		}
	}

	/**
	 * Clears the cache for all qualifed expert adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QualifedExpertAddImpl.class);

		finderCache.clearCache(QualifedExpertAddImpl.class);
	}

	/**
	 * Clears the cache for the qualifed expert add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QualifedExpertAdd qualifedExpertAdd) {
		entityCache.removeResult(
			QualifedExpertAddImpl.class, qualifedExpertAdd);
	}

	@Override
	public void clearCache(List<QualifedExpertAdd> qualifedExpertAdds) {
		for (QualifedExpertAdd qualifedExpertAdd : qualifedExpertAdds) {
			entityCache.removeResult(
				QualifedExpertAddImpl.class, qualifedExpertAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QualifedExpertAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(QualifedExpertAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new qualifed expert add with the primary key. Does not add the qualifed expert add to the database.
	 *
	 * @param qualifedExpertAddId the primary key for the new qualifed expert add
	 * @return the new qualifed expert add
	 */
	@Override
	public QualifedExpertAdd create(long qualifedExpertAddId) {
		QualifedExpertAdd qualifedExpertAdd = new QualifedExpertAddImpl();

		qualifedExpertAdd.setNew(true);
		qualifedExpertAdd.setPrimaryKey(qualifedExpertAddId);

		qualifedExpertAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return qualifedExpertAdd;
	}

	/**
	 * Removes the qualifed expert add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualifedExpertAddId the primary key of the qualifed expert add
	 * @return the qualifed expert add that was removed
	 * @throws NoSuchQualifedExpertAddException if a qualifed expert add with the primary key could not be found
	 */
	@Override
	public QualifedExpertAdd remove(long qualifedExpertAddId)
		throws NoSuchQualifedExpertAddException {

		return remove((Serializable)qualifedExpertAddId);
	}

	/**
	 * Removes the qualifed expert add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qualifed expert add
	 * @return the qualifed expert add that was removed
	 * @throws NoSuchQualifedExpertAddException if a qualifed expert add with the primary key could not be found
	 */
	@Override
	public QualifedExpertAdd remove(Serializable primaryKey)
		throws NoSuchQualifedExpertAddException {

		Session session = null;

		try {
			session = openSession();

			QualifedExpertAdd qualifedExpertAdd =
				(QualifedExpertAdd)session.get(
					QualifedExpertAddImpl.class, primaryKey);

			if (qualifedExpertAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQualifedExpertAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(qualifedExpertAdd);
		}
		catch (NoSuchQualifedExpertAddException noSuchEntityException) {
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
	protected QualifedExpertAdd removeImpl(
		QualifedExpertAdd qualifedExpertAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qualifedExpertAdd)) {
				qualifedExpertAdd = (QualifedExpertAdd)session.get(
					QualifedExpertAddImpl.class,
					qualifedExpertAdd.getPrimaryKeyObj());
			}

			if (qualifedExpertAdd != null) {
				session.delete(qualifedExpertAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (qualifedExpertAdd != null) {
			clearCache(qualifedExpertAdd);
		}

		return qualifedExpertAdd;
	}

	@Override
	public QualifedExpertAdd updateImpl(QualifedExpertAdd qualifedExpertAdd) {
		boolean isNew = qualifedExpertAdd.isNew();

		if (!(qualifedExpertAdd instanceof QualifedExpertAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(qualifedExpertAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					qualifedExpertAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in qualifedExpertAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QualifedExpertAdd implementation " +
					qualifedExpertAdd.getClass());
		}

		QualifedExpertAddModelImpl qualifedExpertAddModelImpl =
			(QualifedExpertAddModelImpl)qualifedExpertAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (qualifedExpertAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				qualifedExpertAdd.setCreateDate(date);
			}
			else {
				qualifedExpertAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!qualifedExpertAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				qualifedExpertAdd.setModifiedDate(date);
			}
			else {
				qualifedExpertAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(qualifedExpertAdd);
			}
			else {
				qualifedExpertAdd = (QualifedExpertAdd)session.merge(
					qualifedExpertAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QualifedExpertAddImpl.class, qualifedExpertAddModelImpl, false,
			true);

		if (isNew) {
			qualifedExpertAdd.setNew(false);
		}

		qualifedExpertAdd.resetOriginalValues();

		return qualifedExpertAdd;
	}

	/**
	 * Returns the qualifed expert add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qualifed expert add
	 * @return the qualifed expert add
	 * @throws NoSuchQualifedExpertAddException if a qualifed expert add with the primary key could not be found
	 */
	@Override
	public QualifedExpertAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQualifedExpertAddException {

		QualifedExpertAdd qualifedExpertAdd = fetchByPrimaryKey(primaryKey);

		if (qualifedExpertAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQualifedExpertAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return qualifedExpertAdd;
	}

	/**
	 * Returns the qualifed expert add with the primary key or throws a <code>NoSuchQualifedExpertAddException</code> if it could not be found.
	 *
	 * @param qualifedExpertAddId the primary key of the qualifed expert add
	 * @return the qualifed expert add
	 * @throws NoSuchQualifedExpertAddException if a qualifed expert add with the primary key could not be found
	 */
	@Override
	public QualifedExpertAdd findByPrimaryKey(long qualifedExpertAddId)
		throws NoSuchQualifedExpertAddException {

		return findByPrimaryKey((Serializable)qualifedExpertAddId);
	}

	/**
	 * Returns the qualifed expert add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualifedExpertAddId the primary key of the qualifed expert add
	 * @return the qualifed expert add, or <code>null</code> if a qualifed expert add with the primary key could not be found
	 */
	@Override
	public QualifedExpertAdd fetchByPrimaryKey(long qualifedExpertAddId) {
		return fetchByPrimaryKey((Serializable)qualifedExpertAddId);
	}

	/**
	 * Returns all the qualifed expert adds.
	 *
	 * @return the qualifed expert adds
	 */
	@Override
	public List<QualifedExpertAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qualifed expert adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @return the range of qualifed expert adds
	 */
	@Override
	public List<QualifedExpertAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qualifed expert adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qualifed expert adds
	 */
	@Override
	public List<QualifedExpertAdd> findAll(
		int start, int end,
		OrderByComparator<QualifedExpertAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the qualifed expert adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of qualifed expert adds
	 */
	@Override
	public List<QualifedExpertAdd> findAll(
		int start, int end,
		OrderByComparator<QualifedExpertAdd> orderByComparator,
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

		List<QualifedExpertAdd> list = null;

		if (useFinderCache) {
			list = (List<QualifedExpertAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUALIFEDEXPERTADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUALIFEDEXPERTADD;

				sql = sql.concat(QualifedExpertAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QualifedExpertAdd>)QueryUtil.list(
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
	 * Removes all the qualifed expert adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QualifedExpertAdd qualifedExpertAdd : findAll()) {
			remove(qualifedExpertAdd);
		}
	}

	/**
	 * Returns the number of qualifed expert adds.
	 *
	 * @return the number of qualifed expert adds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_QUALIFEDEXPERTADD);

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
		return "qualifedExpertAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUALIFEDEXPERTADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QualifedExpertAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the qualifed expert add persistence.
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

		QualifedExpertAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QualifedExpertAddUtil.setPersistence(null);

		entityCache.removeCache(QualifedExpertAddImpl.class.getName());
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

	private static final String _SQL_SELECT_QUALIFEDEXPERTADD =
		"SELECT qualifedExpertAdd FROM QualifedExpertAdd qualifedExpertAdd";

	private static final String _SQL_SELECT_QUALIFEDEXPERTADD_WHERE =
		"SELECT qualifedExpertAdd FROM QualifedExpertAdd qualifedExpertAdd WHERE ";

	private static final String _SQL_COUNT_QUALIFEDEXPERTADD =
		"SELECT COUNT(qualifedExpertAdd) FROM QualifedExpertAdd qualifedExpertAdd";

	private static final String _SQL_COUNT_QUALIFEDEXPERTADD_WHERE =
		"SELECT COUNT(qualifedExpertAdd) FROM QualifedExpertAdd qualifedExpertAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "qualifedExpertAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QualifedExpertAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QualifedExpertAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QualifedExpertAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}